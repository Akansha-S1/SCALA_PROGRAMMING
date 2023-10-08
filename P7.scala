object scala_basic {
 def test(str: String, n: Int): String =
 {
 str.take(n) + str.drop(n + 1)
 } 
 def main(args: Array[String]): Unit = {
 println("Result: " + test("12345.6", 1));
 println("Result: " + test("12345.6", 0));
 println("Result: " + test("12345.6", 4));
 }
}