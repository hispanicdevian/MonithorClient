package api

fun launchAPI() {
    val binaryPath = "src/main/kotlin/api/monithorapi23"
    ProcessBuilder(binaryPath).start()
    println("monithorapi = on")
}
// You cna replace this kill fun, with the one below, but there's no fun in using that
fun pkillAPI() {
    val binaryPath = "src/main/kotlin/api/PkillScript.sh"
    ProcessBuilder("bash", binaryPath).start()
    println("monithorapi = off")
}
// This code talks directly to shell instead of using a script
/*
fun pkillAPI() {
    val process = ProcessBuilder("pkill", "-x", "monithorapi23")
        .redirectOutput(ProcessBuilder.Redirect.INHERIT)
        .redirectError(ProcessBuilder.Redirect.INHERIT)
        .start()
    val result = process.waitFor()
    if (result == 0) {
        println("monithorapi = off")
    } else {
        println("monithorapi = NOT off")
    }
}
 */