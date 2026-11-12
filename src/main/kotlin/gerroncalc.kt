import kotlin.math.sqrt
import kotlin.system.exitProcess
fun halfperimetr(){
    println("Сторона а: ")
    val inputa = readln()
    val a = inputa.toDoubleOrNull()
    val command = inputa.lowercase()
    if(command == "exit"){
        exitProcess(0)
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
            return
        }

}
fun main(){

        while(true){
            println("Введи значения сторон для расчета или впиши exit")
            halfperimetr()}

}