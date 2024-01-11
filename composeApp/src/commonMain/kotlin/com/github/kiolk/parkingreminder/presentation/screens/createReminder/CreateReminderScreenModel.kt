package com.github.kiolk.parkingreminder.presentation.screens.createReminder

import cafe.adriel.voyager.core.model.StateScreenModel

class CreateReminderScreenModel: StateScreenModel<CreateReminderScreenModel.State>(State.Idle) {

    data class StateModel(
        val reminder: String,
    )

    sealed class State {

        data object Idle : State()
        data object Loading : State()
        data class Data(val state: StateModel) : State()
    }
}