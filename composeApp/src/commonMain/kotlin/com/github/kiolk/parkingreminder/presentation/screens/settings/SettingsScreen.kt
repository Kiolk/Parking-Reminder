package com.github.kiolk.parkingreminder.presentation.screens.settings

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import cafe.adriel.voyager.core.screen.Screen
import cafe.adriel.voyager.koin.getScreenModel
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import org.koin.core.parameter.parametersOf

class SettingsScreen : Screen {

    @Composable
    override fun Content() {
        val screenModel: SettingsScreenModel = getScreenModel { parametersOf("someSettings") }
        val state by screenModel.state.collectAsState()

        when (val data = state) {
            is SettingsScreenModel.State.Data -> Column {
                Text(data.state.settings)
            }

            SettingsScreenModel.State.Idle -> TODO()
            SettingsScreenModel.State.Loading -> TODO()
        }
    }
}