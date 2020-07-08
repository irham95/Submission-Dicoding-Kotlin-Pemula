class User(val name : String, val age : Int)

data class DataUser(val name : String, val age : Int)

fun main(){
    val user = User("irham", 24)
    val dataUser = DataUser("irham", 24)

    println(user)
    println(dataUser)
}