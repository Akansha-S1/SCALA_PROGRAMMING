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
    println("Enter a number to calculate its factorial:")
    val input = scala.io.StdIn.readInt()
    
    val result = MathUtils.factorial(input)
    println(s"The factorial of $input is: $result")
  }
}
