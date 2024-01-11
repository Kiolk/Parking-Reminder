package com.github.kiolk.parkingreminder.presentation.screens.reminders

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import cafe.adriel.voyager.core.screen.Screen
import cafe.adriel.voyager.koin.getScreenModel

class RemindersScreen : Screen {
    @Composable
    override fun Content() {
        val screenModel: RemindersScreenModel = getScreenModel()
        val state by screenModel.state.collectAsState()

        when (val data = state) {
            is RemindersScreenModel.State.Data -> Column {

            }
            RemindersScreenModel.State.Idle -> TODO()
            RemindersScreenModel.State.Loading -> TODO()
        }
    }
}