import kotlin.system.exitProcess
import java.io.File

val score = File("score.txt")
var player_wins = 0
var computer_wins = 0
fun savescore() {
    score.writeText("$player_wins $computer_wins")
}

fun loadscore() {
    if (score.exists()) {
        val parts = score.readText().split(" ")
        if (parts.size >= 2) {
            computer_wins = parts[1].toIntOrNull() ?: 0
            player_wins = parts[0].toIntOrNull() ?: 0
            println("Счет загружен: Игрок $player_wins : Комп $computer_wins")
        }
    } else {
        score.writeText("0 0")
    }
}

fun knb() {
    val line = listOf("камень", "ножницы", "бумага")
    val knb = line.random()
    println("Вводи свой выбор $line или вводи exit чтобы выйти и wins чтобы увидеть счет и записать очки")
    val input = readln().lowercase()
    if (input == "load") {
        loadscore()
        return
    }
    if (input == "save") {
        savescore()
        return
    }
    if (input == "exit") {
        savescore()
        exitProcess(0)
    }
    if (input == "wins") {
        println("Победы игрока $player_wins")
        println("Победы компьютера $computer_wins")
        return
    }
    if (input !in line) {
        println("Нужно выбрать что-то из $line")
        return
    }
    println("компьютер выбрал $knb")
    if (input == knb) {
        println("Ничья")
        return
    }
    if (input == "камень" && knb == "бумага" ||
        input == "ножницы" && knb == "камень" ||
        input == "бумага" && knb == "ножницы"
    ) {
        println("You lose")
        computer_wins++
        return
    }
    if (input == "камень" && knb == "ножницы" ||
        input == "бумага" && knb == "камень" ||
        input == "ножницы" && knb == "бумага"
    ) {
        println("You win")
        player_wins++
        return
    }
}

fun main() {
    while (true) {
        knb()
    }
}