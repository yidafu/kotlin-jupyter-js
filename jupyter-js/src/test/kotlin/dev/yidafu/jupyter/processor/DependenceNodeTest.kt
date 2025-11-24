package dev.yidafu.jupyter.processor

import dev.yidafu.jupyter.CircularDependencyException
import io.kotest.assertions.throwables.shouldThrow
import io.kotest.core.spec.style.ShouldSpec
import io.kotest.matchers.shouldBe
import io.kotest.matchers.types.shouldBeInstanceOf

class DependenceNodeTest :
    ShouldSpec({
        context("DependenceNode.addChildren() tests") {
            should("should create and return new child node when child does not exist") {
                val root = DependenceNode("root")
                val child = root.addChildren("child1")

                child.source shouldBe "child1"
                child.parent shouldBe root
                root.children.size shouldBe 1
                root.children[0] shouldBe child
            }

            should("should return existing child node when child already exists") {
                val root = DependenceNode("root")
                val firstChild = root.addChildren("child1")
                val secondChild = root.addChildren("child1")

                firstChild shouldBe secondChild
                root.children.size shouldBe 1
            }

            should("should add multiple different children") {
                val root = DependenceNode("root")
                val child1 = root.addChildren("child1")
                val child2 = root.addChildren("child2")
                val child3 = root.addChildren("child3")

                root.children.size shouldBe 3
                child1.source shouldBe "child1"
                child2.source shouldBe "child2"
                child3.source shouldBe "child3"
                child1.parent shouldBe root
                child2.parent shouldBe root
                child3.parent shouldBe root
            }
        }

        context("DependenceNode.detectCircularDependency() tests") {
            should("should not throw exception when no circular dependency exists") {
                val root = DependenceNode("root")
                val child1 = root.addChildren("child1")
                val child2 = child1.addChildren("child2")
                val child3 = child2.addChildren("child3")

                // Should not throw exception
                child3.addChildren("child4")
            }

            should("should throw CircularDependencyException when direct parent matches child") {
                val root = DependenceNode("root")
                val child1 = root.addChildren("child1")

                shouldThrow<CircularDependencyException> {
                    child1.addChildren("root")
                }
            }

            should("should throw CircularDependencyException when indirect parent matches child") {
                val root = DependenceNode("root")
                val child1 = root.addChildren("child1")
                val child2 = child1.addChildren("child2")
                val child3 = child2.addChildren("child3")

                shouldThrow<CircularDependencyException> {
                    child3.addChildren("child1")
                }
            }

            should("should throw CircularDependencyException when grandparent matches child") {
                val root = DependenceNode("root")
                val child1 = root.addChildren("child1")
                val child2 = child1.addChildren("child2")
                val child3 = child2.addChildren("child3")

                shouldThrow<CircularDependencyException> {
                    child3.addChildren("root")
                }
            }

            should("should throw CircularDependencyException with correct parent and child names") {
                val root = DependenceNode("root")
                val child1 = root.addChildren("child1")
                val child2 = child1.addChildren("child2")

                val exception =
                    shouldThrow<CircularDependencyException> {
                        child2.addChildren("child1")
                    }

                exception.message shouldBe "Jupyter JS not support circular dependency:\nchild1\n|    ^\nV    |\nchild1"
            }

            should("should not throw exception when adding child to root node") {
                val root = DependenceNode("root")

                // Root has no parent, so no circular dependency check needed
                val child = root.addChildren("child1")
                child.source shouldBe "child1"
            }

            should("should handle deep dependency chain without circular dependency") {
                val root = DependenceNode("root")
                val level1 = root.addChildren("level1")
                val level2 = level1.addChildren("level2")
                val level3 = level2.addChildren("level3")
                val level4 = level3.addChildren("level4")

                // Should not throw exception
                level4.addChildren("level5")
            }

            should("should detect circular dependency in deep chain") {
                val root = DependenceNode("root")
                val level1 = root.addChildren("level1")
                val level2 = level1.addChildren("level2")
                val level3 = level2.addChildren("level3")
                val level4 = level3.addChildren("level4")

                shouldThrow<CircularDependencyException> {
                    level4.addChildren("level2")
                }
            }
        }

        context("DependenceNode data class properties") {
            should("should have correct source property") {
                val node = DependenceNode("test-source")
                node.source shouldBe "test-source"
            }

            should("should have correct parent property") {
                val root = DependenceNode("root")
                val child = root.addChildren("child")
                child.parent shouldBe root
            }

            should("should have null parent for root node") {
                val root = DependenceNode("root")
                root.parent shouldBe null
            }

            should("should have empty children list initially") {
                val node = DependenceNode("test")
                node.children.size shouldBe 0
            }

            should("should maintain children list correctly") {
                val root = DependenceNode("root")
                val child1 = root.addChildren("child1")
                val child2 = root.addChildren("child2")

                root.children.size shouldBe 2
                root.children shouldBe listOf(child1, child2)
            }
        }

        context("DependenceNode edge cases") {
            should("should handle adding same child multiple times") {
                val root = DependenceNode("root")
                val child1 = root.addChildren("child")
                val child2 = root.addChildren("child")
                val child3 = root.addChildren("child")

                child1 shouldBe child2
                child2 shouldBe child3
                root.children.size shouldBe 1
            }

            should("should handle complex dependency tree") {
                val root = DependenceNode("root")
                val branch1 = root.addChildren("branch1")
                val branch2 = root.addChildren("branch2")
                val leaf1 = branch1.addChildren("leaf1")
                val leaf2 = branch1.addChildren("leaf2")
                val leaf3 = branch2.addChildren("leaf3")

                root.children.size shouldBe 2
                branch1.children.size shouldBe 2
                branch2.children.size shouldBe 1
            }

            should("should allow adding different children with same name at different levels") {
                val root = DependenceNode("root")
                val level1 = root.addChildren("node")
                val level2 = level1.addChildren("node")

                // Should not throw exception as they are different nodes
                level2.source shouldBe "node"
                level2.parent shouldBe level1
            }
        }
    })
