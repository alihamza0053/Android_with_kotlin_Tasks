import kotlin.math.sqrt

class triangle(
    val a: Double,
    val b: Double,
    val c: Double
) {
    init {
        println("Perimeter: ${perimeter()}")
        println("Area: ${area()}")
    }



    fun area() = sqrt((perimeter()/2) * (perimeter()/2-a) * (perimeter()/2-b) * (perimeter()/2-c))

    fun perimeter() = a + b + c
}