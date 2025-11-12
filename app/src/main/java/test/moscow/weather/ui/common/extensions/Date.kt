package test.moscow.weather.ui.common.extensions

import android.annotation.SuppressLint
import java.text.SimpleDateFormat
import java.util.Date


@SuppressLint("SimpleDateFormat")
fun Date.dateToString(dateFormat: DateFormat): String = SimpleDateFormat(dateFormat.format).format(this)

enum class DateFormat (val format: String){
    EEEE_HH_MM("EEEE HH:mm"),
    HH_MM("HH:mm"),
    EEEE_DD_MMMM("EEEE dd MMMM"),
}