fun main(){
    val name: String = "Ali Hamza"
    var age: Int = 21
    println("I am $name, $age years old.")

    println()
    // 1st home work
    var x = 3
    var y = 4
    var z = 5
    println("First Home Work:")
    println("x: $x")
    println("x + y: ${x + y}")
    println("x + y + z: ${x + y + z}")


    println()
    // 2nd home work
    println("Second Home Work:")
    val pi = 3.14
    var radius = 5.5
    println("The volume of the sphere with the radius $radius is ${0.75 * pi * radius * radius * radius}")

    println()
    //3rd home work
    println("Third Home Work:")
    var myName = "Hamza"
    println("My name in reverse order uppercase is: ${myName.uppercase().reversed()}")

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

    println()
    //5th home work
    println("Fifth Home Work")
    var string = "racecar"
    if (string == string.reversed())
        println("This string '$string' is palindrome.")
    else
        println("This string '$string' is not palindrome")

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



    println()
    //7th home work
    println("Seventh Home Work")
    println()
}