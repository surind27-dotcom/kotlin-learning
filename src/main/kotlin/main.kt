import kotlin.system.exitProcess
var history = mutableListOf<Double>()
const val pi = 3.14
fun circleArea() {
    println("Введи quit/q/exit или радиус")
    val input = readln()
    val command = input.lowercase()
    if (command == "q" || command == "quit" || command == "exit") {
        exitProcess(0)
    }
    if (command == "history"){
        if(history.isNotEmpty()){
            for (item in history){
                println(item)

            }
        } else {
            println("История пуста")
        }
        return
    }
    val r = input.toDoubleOrNull()
    if (r == null) {
        println("Введи число")
        return
    }
    if (r <= 0){
        println("Введи Положительное число")
        return
    }
    else {
        val area: Double = (r * r) * pi
        println(area)
        history.add(area)
        return

    }
}


fun main() {
    while (true) {circleArea()}
   
}
