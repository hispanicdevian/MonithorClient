package api

fun launchAPI() {
    val binaryPath = "src/main/kotlin/api/monithorapi"
    ProcessBuilder(binaryPath).start()
    println("monithorapi = on")
}
