package engine_logic

// Navi Connector
sealed class Screen {
    data object Main : Screen()
    data object Setting : Screen()

    //data object SettingPingBoxes : Screen()
}