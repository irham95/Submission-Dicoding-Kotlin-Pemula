// main function
fun main() {
    val user = setUser("irham", 24)
    println(user)

    printUser("irham")
}

fun setUser(name: String, age: Int) = "Your name is $name, and you $age years old"

fun printUser(name: String) {
    println("Your name is $name")
}