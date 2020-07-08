data class DataUser(val name : String, val age : Int)

fun main(){
    val dataUser = DataUser("nur", 17)
    val dataUser2 = DataUser("nur", 17)
    val dataUser3 = DataUser("irham", 24)

    println(dataUser.equals(dataUser2))
    println(dataUser.equals(dataUser3))

}