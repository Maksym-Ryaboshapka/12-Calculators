import Foundation

func add(_ a: Double, _ b: Double) -> Double {
    return a + b
}

func subtract(_ a: Double, _ b: Double) -> Double {
    return a - b
}

func multiply(_ a: Double, _ b: Double) -> Double {
    return a * b
}

func divide(_ a: Double, _ b: Double) -> Double {
    guard b != 0 else {
        print("Error: Division by zero")
        return Double.nan
    }
    return a / b
}

func main() {
    print("Welcome to the Swift Calculator!")
    print("Enter the first number:")
    let num1 = Double(readLine() ?? "") ?? 0.0

    print("Enter an operator (+, -, *, /):")
    let op = readLine() ?? ""

    print("Enter the second number:")
    let num2 = Double(readLine() ?? "") ?? 0.0

    var result: Double

    switch op {
    case "+":
        result = add(num1, num2)
    case "-":
        result = subtract(num1, num2)
    case "*":
        result = multiply(num1, num2)
    case "/":
        result = divide(num1, num2)
    default:
        print("Invalid operator")
        return
    }

    print("Result: \(result)")
}

main()
