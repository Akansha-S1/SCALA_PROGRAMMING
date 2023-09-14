object MathUtils {
 def factorial(n: Int): BigInt = {
 if (n == 0 || n == 1) {
 1
 } else {
 n * factorial(n - 1)
 }
 }
}
object Main {
 def main(args: Array[String]): Unit = {
 val number1 = 0
 val result1 = MathUtils.factorial(number1)
 println(s"The factorial of $number1 is: $result1")
 val number2 = 1
 val result2 = MathUtils.factorial(number2)
 println(s"The factorial of $number2 is: $result2")
 }
}
