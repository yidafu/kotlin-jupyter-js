package dev.yidafu.swc

import java.nio.file.Files
import java.nio.file.Paths
import java.nio.file.StandardCopyOption

object DllLoader {

    sealed class Platform {
        object Linux : Platform() {
            val cpuArch by lazy {
                System.getProperty("os.arch")
            }
            override fun toString(): String {
                return "Linux"
            }

            fun isArm(): Boolean {
                return cpuArch.contains("arm")
            }

            fun isIntel(): Boolean {
                return cpuArch.startsWith("x")
            }
        }

        object Mac : Platform() {
            private val cpuBrand: String by lazy {
                val pb = ProcessBuilder("sysctl", "-n", "machdep.cpu.brand_string")
                val p = pb.start()
                val br = p.inputReader()
                val details = br.readLine()
                p.waitFor()
                details
            }
            fun isIntel(): Boolean {
                return cpuBrand.contains("Intel")
            }
            fun isM1(): Boolean {
                return cpuBrand.contains("Apple")
            }

            override fun toString(): String {
                return "Mac"
            }
        }
        object Windows : Platform() {
            override fun toString(): String {
                return "Windows"
            }
        }

        object Solaris : Platform() {
            override fun toString(): String {
                return "Solaris"
            }
        }

        object FreeBSD : Platform() {
            override fun toString(): String {
                return "FreeBSD"
            }
        }
        companion object {
            val current by lazy {

                val osName = System.getProperty("os.name")
//                darwin-arm64   darwin-x64     lib            linux-x64-gnu  linux-x64-musl win32-x64-msvc
                when {
                    osName.startsWith("Linux") -> Linux
                    osName.startsWith("Mac") || osName.startsWith("Darwin") -> Mac
                    osName.startsWith("Windows") -> Windows
                    osName.startsWith("Solaris") || osName.startsWith("SunOS") -> Solaris
                    osName.startsWith("FreeBSD") -> FreeBSD
                    else -> { throw UnsatisfiedLinkError("Unsupported OS: $osName") }
                }
            }
        }
    }

    fun copyDll2Temp(libName: String): String {
        val jarPath = when (val p = Platform.current) {
            is Platform.Linux -> (if (p.isArm()) "linux-arm-gnueabihf" else "linux-x64-musl") + "/lib$libName.so"
            is Platform.Mac -> (if (p.isIntel()) "darwin-x64" else "darwin-arm64") + "/lib$libName.dylib"
            is Platform.Windows -> "win32-x64-msvc/$libName.dll"
//            Platform.SOLARIS -> TODO()
//            Platform.FREEBSD -> TODO()
//            Platform.UNSPECIFIED -> TODO()
            else -> {
                throw UnsatisfiedLinkError("Unsupported platform $p")
            }
        }
        // TODO: add version postfix
        val outAbsPath = System.getProperty("java.io.tmpdir") + "/swc-jni/" + jarPath
        val inStream = DllLoader::class.java.classLoader.getResourceAsStream(jarPath)!!
        val outPath = Paths.get(outAbsPath)
        Files.createDirectories(outPath.parent)
        Files.copy(inStream, outPath, StandardCopyOption.REPLACE_EXISTING)
        return outAbsPath
    }
}
