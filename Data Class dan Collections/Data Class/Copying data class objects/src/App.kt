data class DataUser(val name : String, val age : Int)

fun main(){
    val dataUser = DataUser("nur", 17)
    val dataUser2 = DataUser("nur", 17)
    val dataUser3 = DataUser("irham", 24)
    val dataUser4 = dataUser.copy()

    println(dataUser4)
}