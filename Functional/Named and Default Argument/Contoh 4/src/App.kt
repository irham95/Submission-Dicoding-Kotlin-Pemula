// main function
fun main() {
    val fullName = getFullName(first = "Nama Lengkap")
    print(fullName)
}

fun getFullName(first: String = "Nama", middle: String = " Saya ", last: String = "Irham Nurrahman"): String {
    return "$first $middle $last"
}