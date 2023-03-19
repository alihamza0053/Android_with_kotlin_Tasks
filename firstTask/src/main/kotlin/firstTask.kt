fun main(){
    println("Enter Your Name:")
    val name = readln()?.capitalize()
    println("Enter Your Degree:")
    val study = readln()
    println("Enter Your City Name:")
    val city = readln()
    println("Enter Your Age:")
    val age = readln().toInt()
    var age_cmnt = ""
    when(age){
        in 1..12 -> age_cmnt ="Kid"
        in 13..18 -> age_cmnt = "Growing"
        in 19..50 ->  age_cmnt = "a Man"
        in 51..65 -> age_cmnt = "getting Old"
        in 66..100 ->  age_cmnt = "very Old"
        else ->  age_cmnt = "felling shy to telling my age!"
    }
    println("I am $name student of $study from $city. According to my age I am $age_cmnt")

}