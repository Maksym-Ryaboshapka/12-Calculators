#include <iostream>
using namespace std;

int main() {
    double a, b;
    char operation;

    cout << "Введіть перше число: ";
    cin >> a;

    cout << "Введіть операцію (+, -, *, /): ";
    cin >> operation;

    cout << "Введіть друге число: ";
    cin >> b;

    switch (operation) {
        case '+':
            cout << "Результат: " << a + b << endl;
            break;
        case '-':
            cout << "Результат: " << a - b << endl;
            break;
        case '*':
            cout << "Результат: " << a * b << endl;
            break;
        case '/':
            if (b != 0) {
                cout << "Результат: " << a / b << endl;
            } else {
                cout << "Помилка: Ділення на нуль!" << endl;
            }
            break;
        default:
            cout << "Невідома операція." << endl;
    }

    return 0;
}
