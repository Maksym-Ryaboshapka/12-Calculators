use std::io;

fn main() {
    println!("Ласкаво просимо до калькулятора!");
    println!("Введіть перше число:");
    let num1 = read_number();

    println!("Введіть математичну операцію (+, -, *, /):");
    let operator = read_operator();

    println!("Введіть друге число:");
    let num2 = read_number();

    let result = match operator {
        '+' => num1 + num2,
        '-' => num1 - num2,
        '*' => num1 * num2,
        '/' => num1 / num2,
        _ => {
            println!("Невідомий оператор. Використовуйте +, -, *, або /.");
            return;
        }
    };

    println!("Результат: {}", result);
}

fn read_number() -> f64 {
    let mut input = String::new();
    io::stdin().read_line(&mut input).expect("Не вдалося прочитати рядок");
    input.trim().parse().expect("Не вдалося перетворити на число")
}

fn read_operator() -> char {
    let mut input = String::new();
    io::stdin().read_line(&mut input).expect("Не вдалося прочитати рядок");
    input.trim().chars().next().expect("Очікувався оператор")
}
