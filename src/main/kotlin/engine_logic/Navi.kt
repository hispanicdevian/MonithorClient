package engine_logic

// Navi Connector
sealed class Navi {
    data object Main : Navi()
    data object Settings : Navi()
    data object SettingsPingBoxes : Navi()
}