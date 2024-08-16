<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Document</title>
</head>
<body>
  <?php
  if (isset($_POST['sub'])) {
      $num1 = $_POST['n1'];
      $num2 = $_POST['n2'];
      $oprnd = $_POST['sub'];

      if ($oprnd == "+")
          $ans = $num1 + $num2;
      else if ($oprnd == "-")
          $ans = $num1 - $num2;
      else if ($oprnd == "x")
          $ans = $num1 * $num2;
      else if ($oprnd == "/")
          $ans = $num1 / $num2;
  }
  ?>

  <form method="post">
      <input type="number" name="n1" placeholder="Перше число" required>
      <select name="sub">
          <option value="+">+</option>
          <option value="-">-</option>
          <option value="x">*</option>
          <option value="/">/</option>
      </select>
      <input type="number" name="n2" placeholder="Друге число" required>
      <input type="submit" value="Обчислити">
  </form>

  Результат: <?php echo $ans ?? ''; ?>
</body>
</html>