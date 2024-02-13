package engine_logic

import engine_logic.read_and_write.*

// Global Ip list
var ipAddress0 = readIpFile0()
var ipAddress1 = readIpFile1()
var ipAddress2 = readIpFile2()
var ipAddress3 = readIpFile3()
var ipAddress4 = readIpFile4()
var ipAddress5 = readIpFile5()
var ipAddress6 = readIpFile6()
var ipAddress7 = readIpFile7()
var ipAddress8 = readIpFile8()
var ipAddress9 = readIpFile9()
var ipAddress10 = readIpFile10()
var ipAddress11 = readIpFile11()

// PingSettingBoxesA.kt, ReWrTitleA.kt
var ipTitle00 = readTiFile0()
var ipTitle01 = readTiFile1()
var ipTitle02 = readTiFile2()
var ipTitle03 = readTiFile3()

// PingSettingBoxesB.kt, ReWrTitleB.kt
var ipTitle04 = readTiFile4()
var ipTitle05 = readTiFile5()
var ipTitle06 = readTiFile6()
var ipTitle07 = readTiFile7()

// PingSettingBoxesC.kt, ReWrTitleC
var ipTitle08 = readTiFile8()
var ipTitle09 = readTiFile9()
var ipTitle10 = readTiFile10()
var ipTitle11 = readTiFile11()

// Path for ReadWriterIP(ABC).kt
const val RWI_PATH = "LightsData/RWI"

// Path for ReWrTitle(ABC).kt
const val RWT_PATH = "LightsData/RWT"

// Path for SaveLoadFont.kt
const val SLF_PATH = "LightsData/SLF"

// Path for SaveLoadMain.kt
const val SLM_PATH = "LightsData/SLM"

// PingSettingBoxes.kt
const val placeHolderTitle = "Title"
const val placeHolderIP = "IP/Hostname"