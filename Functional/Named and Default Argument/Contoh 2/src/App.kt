// main function
fun main() {
    val fullName = getFullName(middle = " adalah " , first = "Saya", last = "Irham")
    print(fullName)
}

fun getFullName(first: String, middle: String, last: String): String {
    return "$first $middle $last"
}