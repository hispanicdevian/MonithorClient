package engine_logic

////////////////////////////// Navigation anchors
sealed class Navi {
/////////////// Main screens
    data object MainScn : Navi()
    data object SettingScn : Navi()
/////////////// Secondary screens
    data object SettingPingBxs : Navi()
    data object SettingFontSz : Navi()
    data object SettingOnOffBxs : Navi()
}