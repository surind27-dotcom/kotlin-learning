import kotlin.system.exitProcess
val secret = (1..100).random()
fun game() {
    val a = readln().toIntOrNull()
    if (a == null) {
        println("Нужно вводить числа")
        return
    }
    when {
        a == secret -> {
            println("Вы победили")
            exitProcess(0)
        }

        a < secret -> println("Бери больше")
        a > secret -> println("Бери меньше")

    }
}
fun main() {
    while (true) {
        game()
    }
}
