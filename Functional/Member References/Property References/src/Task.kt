var message = "Irham"

fun main() {
    println(::message.name)
    println(::message.get())

    ::message.set("Irham Nurrahman")

    println(::message.get())
}