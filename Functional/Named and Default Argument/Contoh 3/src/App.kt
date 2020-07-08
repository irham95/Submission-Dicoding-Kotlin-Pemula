// main function
fun main() {
    val fullName = getFullName()
    print(fullName)
}

fun getFullName(
        first: String = "Saya",
        middle: String = " Adalah ",
        last: String = "Irham"): String {
    return "$first $middle $last"
}