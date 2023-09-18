abstract class Shape {
 def area: Double
}
class Rectangle(width: Double, height: Double) extends Shape {
 override def area: Double = width * height
}
class Circle(radius: Double) extends Shape {
 override def area: Double = math.Pi * radius * radius
}
object ShapeApp {
 def main(args: Array[String]): Unit = {
 val rectangle = new Rectangle(7, 5)
 println(s"Rectangle Area: ${rectangle.area}")
 val circle = new Circle(4.5)
 println(s"Circle Area: ${circle.area}")
 }
}