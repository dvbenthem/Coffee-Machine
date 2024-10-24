// implement your function here
fun createFullName(firstName: String, lastName: String): String {
    return "$firstName $lastName"
}

fun main(args: Array<String>) {
    val firstName = readln()
    val lastName = readln()
    println(createFullName(firstName, lastName))
}