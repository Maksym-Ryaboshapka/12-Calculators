package main

import (
    "fmt"
)

func main() {
    var operator string
    fmt.Println("Введіть оператор (+, -, *, /):")
    fmt.Scan(&operator)

    var num1, num2 float64
    fmt.Println("Введіть два числа:")
    fmt.Scan(&num1, &num2)

    switch operator {
    case "+":
        fmt.Println(num1 + num2)
    case "-":
        fmt.Println(num1 - num2)
    case "*":
        fmt.Println(num1 * num2)
    case "/":
        if num2 != 0 {
            fmt.Println(num1 / num2)
        } else {
            fmt.Println("Ділення на нуль неможливе")
        }
    default:
        fmt.Println("Невірний оператор")
    }
}
