data class DataUser(val name : String, val age : Int)

fun main(){
    val dataUser = DataUser("nur", 17)
    val (name, age) = dataUser

    println("My name is $name, I am $age years old")
}