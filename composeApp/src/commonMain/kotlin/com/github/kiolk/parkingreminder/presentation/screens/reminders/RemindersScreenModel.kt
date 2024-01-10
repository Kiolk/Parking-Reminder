package com.github.kiolk.parkingreminder.presentation.screens.reminders

import cafe.adriel.voyager.core.model.StateScreenModel

class RemindersScreenModel :
    StateScreenModel<RemindersScreenModel.State>(State.Data(StateModel(reminders = emptyList()))) {

    data class StateModel(
        val reminders: List<String>,
    )

    sealed class State {

        data object Idle : State()
        data object Loading : State()
        data class Data(val state: StateModel) : State()
    }
}