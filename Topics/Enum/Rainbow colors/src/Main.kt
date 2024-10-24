fun main() {
    // put your code here
    val readColor = readln()

    println(isRainbow(readColor))


}
enum class Rainbow(val color: String, val rgb: String) {
    RED("Red", "#FF0000"),
    ORANGE("Orange", "#FF7F00"),
    YELLOW("Yellow", "#FFFF00"),
    GREEN("Green", "#00FF00"),
    BLUE("Blue", "#0000FF"),
    INDIGO("Indigo", "#4B0082"),
    VIOLET("Violet", "#8B00FF"),
    NULL("", "");

//    fun printFullInfo(){
//        println("Color: $color, RGB: $rgb")
//    }


}
fun isRainbow(color: String): Boolean{
    for (rainbow in Rainbow.values()){
        if (rainbow.color == color.lowercase().capitalize())
        return true
    }
    return false
}
