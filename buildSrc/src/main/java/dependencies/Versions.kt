package dependencies

object Versions {

    const val versionName = "2.6.0"

    const val targetSdk = 28
    const val minSdk = 9
    const val minSdkWithSupportLibrary = 14

    const val kotlin = "1.3.10"
    internal const val junit = "4.12"
    internal const val robolectric = "4.0.2"
    internal const val assertj = "3.11.1"
    const val gson = "2.8.5"

    internal const val androidGradlePlugin = "3.3.0-beta04"

    internal const val jacoco = "0.8.2"
    internal const val mockito = "2.23.0"
    internal const val mockitoKotlin = "1.6.0"

    object AndroidX {
        const val liveData = "2.0.0"
        internal const val appCompat = "1.0.0"
        internal const val preference = "1.0.0"
        internal const val test = "1.0.0"
    }
}
