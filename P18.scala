object CommonElementsSetExample {
 def main(args: Array[String]): Unit = {
 // Create two sets
 val set1 = Set("A", "B", "C")
 val set2 = Set(1, "E", "A", "G", "H")
 // Print the sets
 println("Set1: " + set1)
 println("Set2: " + set2)
 // Find the common elements between the two sets
 val commonElements = set1.intersect(set2)
 // Print the common elements
 println("Common elements: " + commonElements)
 }
}