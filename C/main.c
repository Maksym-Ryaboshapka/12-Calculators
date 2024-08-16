#include <stdio.h>

// Функція для реалізації простого калькулятора
double simpleCalc(double num1, double num2, char op) {
    double result;

    // Виконуємо відповідну операцію за допомогою switch-case
    switch (op) {
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
            // Перевірка на ділення на нуль
            if (num2 != 0) {
                result = num1 / num2;
            } else {
                printf("Помилка! Ділення на нуль.\\n");
                return 0;
            }
            break;
        default:
            printf("Помилка! Невірний оператор.\\n");
            return 0;
    }

    return result;
}

int main() {
    char op;
    double num1, num2;

    // Введіть оператор (+, -, *, /):
    printf("Введіть оператор (+, -, *, /): ");
    scanf("%c", &op);

    // Введіть два операнди:
    printf("Введіть два операнди: ");
    scanf("%lf %lf", &num1, &num2);

    double result = simpleCalc(num1, num2, op);
    printf("Результат: %.2lf\\n", result);

    return 0;
}
