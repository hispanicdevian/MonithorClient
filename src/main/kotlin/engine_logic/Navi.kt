package engine_logic


//////////////////////////////////////////////////////////// Screen/View Navigation Anchor
sealed class Navi {

//////////////////////////////////////////////////////////// Main Screens
    data object MainScn : Navi()
    data object SettingScn : Navi()
//////////////////////////////////////////////////////////// Secondary Screens
    data object SettingPingBxs : Navi()
    data object SettingFontSz : Navi()
    data object SettingOnOffBxs : Navi()
}
