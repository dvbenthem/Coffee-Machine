fun validatePassword(password: String): Boolean {
    // write your code here
    val validationResult = password.length > 4

    if (validationResult) {
        println("Good password")
    } else {
        println("Your password should be five or longer characters, please write a new password")
    }
    return validationResult
}

// do not change the code below
fun main() {
    var validationResult = false
    while (!validationResult) {
        val password = readln()
        validationResult = validatePassword(password)
    }
}