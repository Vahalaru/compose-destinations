object Versions {
    const val minSdk = 21
    const val compileSdk = 32
    const val targetSdk = compileSdk

    const val kotlin = "1.6.21"
    const val dependencyCheckPlugin = "0.42.0"
    const val gradlePluginVersion = "7.2.1"

    const val composeViewModel = "2.5.0"
    const val activityCompose = "1.5.0"

    const val material = "1.6.1"
    const val lifecycleKtx = "2.5.0"
    const val lifecycleRuntimeKtx = lifecycleKtx

    const val ksp = "1.6.21-1.0.6"

    const val junit = "4.13.2"

    const val compose = "1.2.0-rc03"
    const val composeCompiler = "1.2.0-rc02"
    const val composeNavigation = "2.5.0"
    const val accompanist = "0.24.13-rc"

    const val ktxSerialization = "1.3.3"
    const val mockk = "1.12.4"
}

object Deps {

    object Gradle {
        const val kotlin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin}"
        const val kotlinSerialization = "org.jetbrains.kotlin:kotlin-serialization:${Versions.kotlin}"
        const val dependencyCheckPlugin = "com.github.ben-manes.versions"
        const val pluginVersion = "com.android.tools.build:gradle:${Versions.gradlePluginVersion}"
    }

    object Android {
        const val material = "com.google.android.material:material:${Versions.material}"
    }

    object AndroidX {
        const val lifecycleRuntimeKtx = "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.lifecycleRuntimeKtx}"
        const val activityCompose = "androidx.activity:activity-compose:${Versions.activityCompose}"
    }

    object Compose {
        const val ui = "androidx.compose.ui:ui:${Versions.compose}"
        const val material = "androidx.compose.material:material:${Versions.compose}"
        const val navigation = "androidx.navigation:navigation-compose:${Versions.composeNavigation}"
        const val viewModel = "androidx.lifecycle:lifecycle-viewmodel-compose:${Versions.composeViewModel}"

        const val accompanistMaterial = "com.google.accompanist:accompanist-navigation-material:${Versions.accompanist}"
        const val accompanistAnimation = "com.google.accompanist:accompanist-navigation-animation:${Versions.accompanist}"

    }

    object Ksp {
        const val api = "com.google.devtools.ksp:symbol-processing-api:${Versions.ksp}"
    }

    object KtxSerialization {
        const val json = "org.jetbrains.kotlinx:kotlinx-serialization-json:${Versions.ktxSerialization}"
    }

    object Test {
        const val junit = "junit:junit:${Versions.junit}"
        const val mockk = "io.mockk:mockk:${Versions.mockk}"
    }
}
