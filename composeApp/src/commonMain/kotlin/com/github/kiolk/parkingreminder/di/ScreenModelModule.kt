import com.github.kiolk.parkingreminder.presentation.screens.reminders.RemindersScreenModel
import com.github.kiolk.parkingreminder.presentation.screens.settings.SettingsScreenModel
import org.koin.dsl.module

val screenModelModule = module {
    factory { params -> SettingsScreenModel(params.get<String>()) }
    factory { RemindersScreenModel() }
}
