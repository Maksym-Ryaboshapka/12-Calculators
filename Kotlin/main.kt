fun add(a: Double, b: Double): Double {
    return a + b
}

fun subtract(a: Double, b: Double): Double {
    return a - b
}

fun multiply(a: Double, b: Double): Double {
    return a * b
}

fun divide(a: Double, b: Double): Double {
    if (b != 0.0) {
        return a / b
    } else {
        throw IllegalArgumentException("Cannot divide by zero")
    }
}

fun main() {
    val num1 = 10.0
    val num2 = 5.0

    println("Addition: ${add(num1, num2)}")
    println("Subtraction: ${subtract(num1, num2)}")
    println("Multiplication: ${multiply(num1, num2)}")
    println("Division: ${divide(num1, num2)}")
}
