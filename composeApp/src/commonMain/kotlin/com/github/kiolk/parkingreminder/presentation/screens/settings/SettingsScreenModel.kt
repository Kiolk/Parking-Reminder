package com.github.kiolk.parkingreminder.presentation.screens.settings

import cafe.adriel.voyager.core.model.StateScreenModel

class SettingsScreenModel(
    settingsString: String,
) : StateScreenModel<SettingsScreenModel.State>(State.Data(StateModel(settings = settingsString))) {

    data class StateModel(
        val settings: String,
    )

    sealed class State {

        data object Idle : State()
        data object Loading : State()
        data class Data(val state: StateModel) : State()
    }
}