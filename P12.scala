class Person(var name: String, var age: Int, var country: String) {
 def getName: String = name
 def setName(newName: String): Unit = {
 name = newName
 }
 def getAge: Int = age
 def setAge(newAge: Int): Unit = {
 age = newAge
 }
 def getCountry: String = country
 def setCountry(newCountry: String): Unit = {
 country = newCountry
 }
}
class Student(name: String, age: Int, country: String, var grade: String)
 extends Person(name, age, country) {
 def getGrade: String = grade
 def setGrade(newGrade: String): Unit = {
 grade = newGrade
 }
}
object StudentApp {
 def main(args: Array[String]): Unit = {
 val student = new Student("Akansha Shetty", 19, "INDIA", "A")
 println("Original Student:")
 println(s"Name: ${student.getName}")
 println(s"Age: ${student.getAge}")
 println(s"Country: ${student.getCountry}")
 println(s"Grade: ${student.getGrade}")
 student.setName("Albino Ellen")
 student.setAge(20)
 student.setCountry("Canada")
 student.setGrade("B")
 println("\nUpdated Student:")
 println(s"Name: ${student.getName}")
 println(s"Age: ${student.getAge}")
 println(s"Country: ${student.getCountry}")
 println(s"Grade: ${student.getGrade}")
 }
}