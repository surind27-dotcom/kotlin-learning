import java.io.File
import java.io.IOException
fun main(args: Array<String>) {
    val userInput = if (args.isNotEmpty()) args[0] else readln()
    val file = File(userInput)
    try {
        val iscreated = file.createNewFile()
        val path = file.absolutePath
        if (iscreated) {
            println("Файл создан $path")
        } else {
            file.setLastModified(System.currentTimeMillis())
            println("Файл уже создан мы просто коснулись его")
        }
    }catch(e: IOException){
        println(e)
    }catch (e: SecurityException){
        println(e)
    }
}