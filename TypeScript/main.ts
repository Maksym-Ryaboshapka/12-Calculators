// Функція для додавання
function add(a: number, b: number): number {
  return a + b;
}

// Функція для віднімання
function subtract(a: number, b: number): number {
  return a - b;
}

// Функція для множення
function multiply(a: number, b: number): number {
  return a * b;
}

// Функція для ділення
function divide(a: number, b: number): number {
  return a / b;
}

// Отримання введених користувачем чисел
const num1: number = parseFloat(prompt('Введіть перше число:'));
const num2: number = parseFloat(prompt('Введіть друге число:'));

// Вибір операції
const operation: string | null = prompt('Виберіть операцію (+, -, *, /):');

let result: number | undefined;

// Виконання обраної операції
switch (operation) {
  case '+':
    result = add(num1, num2);
    break;
  case '-':
    result = subtract(num1, num2);
    break;
  case '*':
    result = multiply(num1, num2);
    break;
  case '/':
    result = divide(num1, num2);
    break;
  default:
    alert('Невірна операція. Спробуйте ще раз.');
}

// Виведення результату
if (result !== undefined) {
  alert(`Результат: ${result}`);
} else {
  alert('Щось пішло не так. Спробуйте ще раз.');
}
