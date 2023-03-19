fun main(){
    val name: String = "Ali Hamza"
    var age: Int = 21
    println("I am $name, $age years old.")
    println("Every Home Work Is commented.")

    /*
    println()
    // 1st home work
    var x = 3
    var y = 4
    var z = 5
    println("First Home Work:")
    println("x: $x")
    println("x + y: ${x + y}")
    println("x + y + z: ${x + y + z}")

     */


    /*
    println()
    // 2nd home work
    println("Second Home Work:")
    val pi = 3.14
    var radius = 5.5
    println("The volume of the sphere with the radius $radius is ${0.75 * pi * radius * radius * radius}")
    */


    /*
    println()
    //3rd home work
    println("Third Home Work:")
    var myName = "Hamza"
    println("My name in reverse order uppercase is: ${myName.uppercase().reversed()}")
    */

    /*
    println()
    //4th home work
    println("Fourth Home Work")
    val simpleExpression = 3>4 || 4>3 && 4<=4

    val bool = true
    x = 9
    y = 3
    z = 9

    val hardExpression =  !(x != z) && bool  || z > (x+y) && (!bool || y < z)
    println("The simple expression is: $simpleExpression")
    println("The hard expression is: $hardExpression")
    */

    /*
    println()
    //5th home work
    println("Fifth Home Work")
    var string = "racecar"
    if (string == string.reversed())
        println("This string '$string' is palindrome.")
    else
        println("This string '$string' is not palindrome")
    */

    /*
    println()
    //6th home work
    println("Sixth Home Work")
    println("Enter your age:")
    var your_age = readLine()
    if (your_age != null)
        if(your_age.toInt() < 18)
            println("You are not an adult yet!")
        else if (your_age.toInt() >=18 && your_age.toInt() <=65 )
            println("You are an adult!")
        else if(your_age.toInt() > 65 && your_age.toInt() <= 120)
            println("You are realy realy old!")
        else
            println("You enter incorrect age!")
    */


    /*
    println()
    //7th home work
    println("Seventh Home Work:")
    println("Enter a Number;")
    var user_number = readLine()?.toInt()
        println("Count form $user_number down to 0:")
        while (user_number != null && user_number >= 0) {
                println(user_number)
                user_number--
    }

    println("Enter Number;")
    var num_input = readLine()?.toInt()
    val num = num_input
    println("Enter Power of your Number;")
    var power_of_num = readLine()?.toInt()
    while (power_of_num != null && power_of_num > 1){
        if (num_input != null && num != null) {
            num_input *= num
            power_of_num--
            }
        }
    println("$num to the power of $power_of_num is $num_input")
    */


    /*
    println()
    //8th home work
    println("Eight Home Work:")
    println("Enter 1st Numer:")
    val num1 = readln().toInt()
    println("Enter 2nd Numer:")
    val num2 = readln().toInt()
    println("Enter 3rd Numer:")
    val num3 = readln().toInt()
    println("Enter 4th Numer:")
    val num4 = readln().toInt()
    println("Enter 5th Numer:")
    val num5 = readln().toInt()

    var sum = num1+num2+num3+num4+num5
    val average = sum/5F
    println("The average of 5 numbers is: $average")

     */


    /*
    println()
    //9th home work
    println("Ninth Home Work:")
    println("Enter 5 Numbers:")
    val num1 = readln().toInt()
    val num2 = readln().toInt()
    val num3 = readln().toInt()
    val num4 = readln().toInt()
    val num5 = readln().toInt()
    var array = mutableListOf<Int>()
    array.add(num1)
    array.add(num2)
    array.add(num3)
    array.add(num4)
    array.add(num5)
    array.reverse()
    println("The 5 numbers in reverse order are: ")
    for (i in array){
        println(i)
    }

    println("Enter a number greater than 1:")
    var number = readln().toInt()
    val num = number
    var x = 0
    var y = 1
    var sum = 0
    var number_array = mutableListOf<Int>()
    while (number != null && number > 0){
        if(number == num){
            number_array.add(0)
            number--
            continue
        }else if(number == num-1){
            number_array.add(1)
            number--
            continue
        }else{
            sum = number_array.elementAt(x) + number_array.elementAt(y)
            number_array.add(sum)
        }
        x++
        y++
        number--
    }
    println(number_array)
     */


    /*
    println()
    //10th home work
    println("Tenth Home Work:")
    println("Enter your country name from list:")
    println("USA")
    println("Argentina")
    println("Pakistan")
    val country = readLine()
    when(country){
        "USA" -> println("Hello")
        "Argentina" -> println("Hola")
        "Pakistan" -> println("Assalam o alaikum")
        else -> println("Sorry! $country not in list.")
    }
     */


    /*
    println()
    //11th home work
    println("Eleventh Home Work:")
    println("Enter a number:")
    fun totalSum(num: Int){
        var x = 0
        for (i in 0..num){
            x+=i
        }
        println("The sum of the values form 1 to $num is: $x")
    }
    totalSum(4)
     */


    /*
    println()
    //12th home work
    println("Twelfth Home Work:")
    val list = listOf<Int>(3,5,4,7,3,5,2,6,7,8,9,)
    println("Enter number to search for:")
    val num = readLine()?.toInt()
    for (i in list){
        if(i == num){
            println(list.indexOf(num))
            break
        }
    }
    
     */

}