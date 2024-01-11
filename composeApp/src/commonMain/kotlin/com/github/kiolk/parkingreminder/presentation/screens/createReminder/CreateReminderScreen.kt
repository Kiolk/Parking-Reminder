package com.github.kiolk.parkingreminder.presentation.screens.createReminder

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import cafe.adriel.voyager.core.screen.Screen
import cafe.adriel.voyager.koin.getScreenModel
import com.github.kiolk.parkingreminder.presentation.screens.reminders.RemindersScreenModel

class CreateReminderScreen : Screen {

    @Composable
    override fun Content() {
        val screenModel: CreateReminderScreenModel = getScreenModel()
        val state by screenModel.state.collectAsState()

        when (val data = state) {
            is CreateReminderScreenModel.State.Data -> TODO()
            CreateReminderScreenModel.State.Idle -> Column { }
            CreateReminderScreenModel.State.Loading -> TODO()
        }
    }
}