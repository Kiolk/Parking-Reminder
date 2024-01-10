package com.github.kiolk.parkingreminder.presentation.screens.home

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import cafe.adriel.voyager.core.screen.Screen
import cafe.adriel.voyager.navigator.Navigator
import cafe.adriel.voyager.navigator.tab.CurrentTab
import cafe.adriel.voyager.navigator.tab.LocalTabNavigator
import cafe.adriel.voyager.navigator.tab.Tab
import cafe.adriel.voyager.navigator.tab.TabNavigator
import cafe.adriel.voyager.navigator.tab.TabOptions
import com.github.kiolk.parkingreminder.presentation.screens.createReminder.CreateReminderScreen
import com.github.kiolk.parkingreminder.presentation.screens.reminders.RemindersScreen
import com.github.kiolk.parkingreminder.presentation.screens.settings.SettingsScreen
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.resources.painterResource

class HomeScreen : Screen {

    @Composable
    override fun Content() {
        TabNavigator(AddTab) {
            Scaffold(
                bottomBar = {
                    BottomNavigation {
                        TabNavigationItem(RemindersTab)
                        TabNavigationItem(AddTab)
                        TabNavigationItem(SettingsTab)
                    }
                }, content = { CurrentTab() })
        }
    }
}

@Composable
private fun RowScope.TabNavigationItem(tab: Tab) {
    val tabNavigator: TabNavigator = LocalTabNavigator.current

    BottomNavigationItem(
        selected = tabNavigator.current == tab,
        onClick = { tabNavigator.current = tab },
        icon = {
            tab.options.icon?.let { icon ->
                Icon(painter = icon, contentDescription = tab.options.title)
            }
        },
        alwaysShowLabel = true,
        label = {
            Text(tab.options.title)
        }
    )
}

object AddTab : Tab {

    @OptIn(ExperimentalResourceApi::class)
    override val options: TabOptions
        @Composable
        get() {
            val title = "Add"
            val icon = painterResource("add.xml")

            return remember {
                TabOptions(
                    index = 0u,
                    title = title,
                    icon = icon
                )
            }
        }

    @Composable
    override fun Content() {
        Navigator(CreateReminderScreen())
    }
}

object SettingsTab : Tab {

    @OptIn(ExperimentalResourceApi::class)
    override val options: TabOptions
        @Composable
        get() {
            val title = "Settings"
            val icon = painterResource("settings.xml")

            return remember {
                TabOptions(
                    index = 0u,
                    title = title,
                    icon = icon
                )
            }
        }

    @Composable
    override fun Content() {
        Navigator(SettingsScreen())
    }
}

object RemindersTab : Tab {

    @OptIn(ExperimentalResourceApi::class)
    override val options: TabOptions
        @Composable
        get() {
            val title = "Reminders"
            val icon = painterResource("alarm.xml")

            return remember {
                TabOptions(
                    index = 0u,
                    title = title,
                    icon = icon
                )
            }
        }

    @Composable
    override fun Content() {
        Box(
            modifier = Modifier.fillMaxSize()
        ) {
            Navigator(RemindersScreen())
        }
    }
}