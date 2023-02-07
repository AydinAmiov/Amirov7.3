import java.lang.Math.sqrt
import kotlin.math.pow

fun main(){
    try {
        println("Введите сторону квадрата")
        var s: Double
        var c: Double
        var o: Double
        s = readLine()!!.toDouble()
        c = (3.14*(sqrt(s)))/(3.14*0.5);
        o = (3.14 * c.pow(2))
        println("площадь квадрата: $c")
        println("площадь круга: $o")
    }
    catch (ex:Exception){
        println("Данные введены не корректно")
    }
}