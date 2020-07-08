// main function
fun main() {
    val fullName = getFullName(first = "Saya" , middle = " adalah ", last = "Irham")
    print(fullName)
}

fun getFullName(first: String, middle: String, last: String): String {
    return "$first $middle $last"
}