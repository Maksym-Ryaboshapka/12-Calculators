using System;

namespace SimpleCalculator
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Простий калькулятор");
            Console.WriteLine("-------------------");

            Console.Write("Введіть перше число: ");
            double num1 = Convert.ToDouble(Console.ReadLine());

            Console.Write("Введіть операцію (+, -, *, /): ");
            char operation = Convert.ToChar(Console.ReadLine());

            Console.Write("Введіть друге число: ");
            double num2 = Convert.ToDouble(Console.ReadLine());

            double result = 0;

            switch (operation)
            {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    if (num2 != 0)
                        result = num1 / num2;
                    else
                        Console.WriteLine("Помилка: Ділення на нуль!");
                    break;
                default:
                    Console.WriteLine("Помилка: Невідома операція.");
                    break;
            }

            Console.WriteLine($"Результат: {result}");
        }
    }
}
