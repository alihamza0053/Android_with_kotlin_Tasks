fun main() {


    var menu_input =""
    fun menu(){
        println("Select from menu")
        println("Select from Menu (1,2,3,4,5,6,7):")
        println("1 Add Student")
        println("2 Delete Student")
        println("3 Search")
        println("4 Sort")
        println("5 Display Data")
        println("6 Insert Data")
        println("7 Exit")
        menu_input = readln()
    }
    menu()
    fun addStudent(){
        println("add student")
        menu()
    }
    fun deleteStudent(){
        println("delete student")
        menu()
    }
    fun search(){
        println("search")
        menu()
    }
    fun sort(){
        println("sort")
        menu()
    }
    fun displayData(){
        println("display data")
        menu()
    }
    fun insertData(){
        println("insert data")
        menu()
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