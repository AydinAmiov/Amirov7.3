import java.lang.Math.sqrt

fun main() {
    try{
        println("Введите высоту")
        var h: Int
        var T: Double
        h = readLine()!!.toInt()
        T =  sqrt(2 * h / 9.8);
        println("Время падения камня: = $T")
    }
    catch (ex:Exception){
        println("Данные введены не корректно")
    }
}