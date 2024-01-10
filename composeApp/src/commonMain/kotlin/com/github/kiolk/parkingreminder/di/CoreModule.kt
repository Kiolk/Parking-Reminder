import org.koin.core.module.Module
import org.koin.dsl.module

val coreModule: Module
    get() = module {
//        includes(platformCoreModule)
//        includes(useCaseMudule)
//        includes(sharedViewModelModule)
        includes(screenModelModule)
    }
