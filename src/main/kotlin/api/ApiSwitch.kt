package api

fun launchAPI() {
    val binaryPath = "src/main/kotlin/api/monithorapi23"
    ProcessBuilder(binaryPath).start()
    println("monithorapi = on")
}

// This code talks directly to shell
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

// This code will run a bash script if you have it
/*
fun pkillAPI() {
    val binaryPath = "src/main/kotlin/api/PkillScript.sh"
    ProcessBuilder("bash", binaryPath).start()
    println("monithorapi = off")
}
 */