sealed trait Color
case object Red extends Color
case object Green extends Color
case object Blue extends Color
case object Orange extends Color
object ColorApp {
 def main(args: Array[String]): Unit = {
 val myColor: Color = Red
 //val myColor: Color = Blue
 printColor(myColor)
 }
 def printColor(color: Color): Unit = color match {
 case Red => println("The color is Red.")
 case Green => println("The color is Green.")
 case Blue => println("The color is Blue.")
 case Orange => println("The color is Orange.")
 case _ => println("Unknown color.")
 }
}
