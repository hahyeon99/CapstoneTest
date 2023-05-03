package techtown.org.kotlintest

data class User(
    var email: String,
    var uId: String,
    var id: String,
    var nickname: String
){
    constructor(): this("","","","")
}
