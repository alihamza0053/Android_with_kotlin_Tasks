fun main() {

    println("Select from Menu (1,2,3,4,5,6,7):")
    println("1 Add Student")
    println("2 Delete Student")
    println("3 Search")
    println("4 Sort")
    println("5 Display Data")
    println("6 Insert Data")
    println("7 Exit")

    val menu_input = readln()
    fun menu(){
        println("Select from menu")
    }
    fun addStudent(){
        println("add student")
    }
    fun deleteStudent(){
        println("delete student")
    }
    fun search(){
        println("search")
    }
    fun sort(){
        println("sort")
    }
    fun displayData(){
        println("display data")
    }
    fun insertData(){
        println("insert data")
    }


    when(menu_input){
        "1" -> addStudent()
        "2" -> deleteStudent()
        "3" -> search()
        "4" -> sort()
        "5" -> displayData()
        "6" -> insertData()
        "7" -> return
        else -> println("Incorrect Selection!")
    }


}