fun main(){

    println("Enter Your Name:")
    val name = readln()
    println("Enter Your Degree:")
    val study = readln()
    println("Enter Your City Name:")
    val city = readln()
    println("Enter Your Age:")
    val age = readln().toInt()
    var age_cmnt = ""
    when (age) {
        in 1..12 -> age_cmnt = "a Kid"
        in 13..18 -> age_cmnt = "Growing"
        in 19..50 -> age_cmnt = "a Man"
        in 51..65 -> age_cmnt = "getting Old"
        in 66..100 -> age_cmnt = "very Old"
        else -> age_cmnt = "felling shy to tell my age!"
    }
    println("Enter Your Grade in Metric (like A):")
    val metric = readln()
    println("Enter Your Intermediate in Metric (like A):")
    val intermediate = readln()
    println("Enter Your Grade in University (like A):")
    val uni_g = readln()
    var grades = mutableListOf<String>()
    grades.add(metric)
    grades.add(intermediate)
    grades.add(uni_g)
    fun myIntro(name:String, study:String, age_cmnt:String, grades: List<String>) {
        println(
            "I am $name student of $study from $city. According to my age I am $age_cmnt. " +
                    "I have a list of my grades in Metric, Intermediate, University $grades"
        )

    }
    myIntro(name,study,age_cmnt,grades)
    println("For now this is all!")
}