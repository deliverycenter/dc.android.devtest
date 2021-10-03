package dc.android.devtest.data.remote.model

import com.google.gson.annotations.SerializedName

data class WeatherDetailsResponse(
    @SerializedName("city_name") val cityName: String,
    @SerializedName("timezone") val timezone: String,
    @SerializedName("data") val data: List<WeatherForecastData>
)

data class WeatherForecastData(
    @SerializedName("valid_date") val validDate: String,
    @SerializedName("wind_spd") val windSpeed: Double,
    @SerializedName("wind_cdir_full") val windDirection: String,
    @SerializedName("temp") val temperature: Double,
    @SerializedName("max_temp") val maxTemp: Double,
    @SerializedName("min_temp") val minTemp: Double,
    @SerializedName("app_max_temp") val apparentMaxTemp: Double, // Feels Like temperature at max_temp time (default Celcius)
    @SerializedName("app_min_temp") val apparentMinTemp: Double, // Feels Like temperature at min_temp time (default Celcius)
    @SerializedName("pop") val pop: Double,   // Probability of Precipitation (%)
    @SerializedName("precip") val precip: Double, // Accumulated liquid equivalent precipitation (default mm)
    @SerializedName("rh") val humidity: Double, // Average relative humidity (%)
    @SerializedName("weather") val weather: Weather,
)

data class Weather(
    @SerializedName("icon") val icon: String,
    @SerializedName("code") val code: Int,
    @SerializedName("description") val description: String,
)