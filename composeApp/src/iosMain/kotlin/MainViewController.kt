import androidx.compose.ui.window.ComposeUIViewController
import cafe.adriel.voyager.navigator.Navigator
import com.github.kiolk.parkingreminder.presentation.screens.home.HomeScreen

fun MainViewController() = ComposeUIViewController { Navigator(HomeScreen()) }
