// Функція для додавання
function add(a, b) {
  return a + b;
}

// Функція для віднімання
function subtract(a, b) {
  return a - b;
}

// Функція для множення
function multiply(a, b) {
  return a * b;
}

// Функція для ділення
function divide(a, b) {
  return a / b;
}

// Отримання введених користувачем чисел
const num1 = parseFloat(prompt('Введіть перше число:'));
const num2 = parseFloat(prompt('Введіть друге число:'));

// Вибір операції
const operation = prompt('Виберіть операцію (+, -, *, /):');

let result;

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
