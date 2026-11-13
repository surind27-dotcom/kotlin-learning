
import kotlin.math.sqrt
import kotlin.system.exitProcess
data class History(val a: Double = 0.0, val b: Double = 0.0, val c: Double = 0.0, val s: Double = 0.0)
var history2gerr = mutableListOf<History>()


fun halfperimetr(){
    println("Сторона а или команда(exit/history)")
    val inputa = readln()
    val a = inputa.toDoubleOrNull()
    val command = inputa.lowercase()
    if(command == "exit"){
        exitProcess(0)
    }
    if(command == "history"){
        if (history2gerr.isNotEmpty()){
            println(history2gerr)
            return}
        println("Сначала прогони хотя-бы 1 треугольник")
        return
    }
    println("Сторона б: ")
    val b = readln().toDoubleOrNull()
    println("Сторона с: ")
    val c = readln().toDoubleOrNull()

    if (a == null || b == null || c == null) {
        println("Вводи числа")
        return
    }
        if (a+b <= c || a+c <= b || c+b <= a){
            println("Такого треугольника не может быть")
            return
        }
        else{
            val p=0.5*(a+b+c)
            val s1 = p*(p-a)*(p-b)*(p-c)
            val s= sqrt(s1)
            println(s)
            val triangle = History(a,b,c,s)
            history2gerr.add(triangle)
            return

        }

}
fun main(){

        while(true){
            halfperimetr()}

}