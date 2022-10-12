package coding.problems.arrays

/**
 * Array
 * =====
 * Array in scala is homogeneous and mutable.
 *
 *
 * ArrayBuffer
 * ==========
 * Unlike Array, ArrayBuffer's size can change.
 * To use ArrayBuffer, we need to import scala.collection.mutable.ArrayBuffer.
 */
object ArraysExercises extends App{
  // Declare array of integers
  var numbers: Array[Int] = Array(0, 1, 2, 3, 4, 5, 6, 7, 8, 9)

  // Print all items of an array
  numbers.foreach(print)

  // Fetch array item by index
  print("\n"); println(numbers(2))

  // Appending an element to int array
  numbers :+ 10

  // Map functions
  numbers.map(_ * 2).foreach(print)  // Double each integer item in an array without the need of any variable.
  val doubled_numbers = numbers.map(x => x * 2)  // Other way of doing the same, but with a new variable.
  print("\nDoubled items in an array\n"); doubled_numbers.foreach(print)

  // Adding two arrays
  val numSet1: Array[Int] = Array(0, 1, 2, 3, 4, 5)
  val numSet2: Array[Int] = Array(6, 7, 8, 9)
  print("\nAdding two arrays\n"); (numSet1 ++ numSet2).foreach(print)

  // Sorting an array
  print("\n")
  val unsortedNums: Array[Int] = Array(7, 2, 9, 3, 1, 4, 0, 8)
  unsortedNums.sorted.foreach(print)

  // Range
  val x = (1 to 5).toArray
  print("\nArray of type integer created using range\n"); x.foreach(print)

  // String arrays
  val fruits: Array[String] = Array("Apple", "Orange", "Banana", "Mango")

  // Check if an item exists
  print("\n")
  println(fruits.exists(_ == "Apple"))
  println(fruits.exists(x => x == "Orange"))

  // Appending string item to a string array
  (fruits :+ "Papaya").foreach(print)  // "Papaya" won't be appended to the immutable fruits variable
  print("\n"); fruits.foreach(print)

  // Iterating string array using map function
  println("\nIterating string array using map function\n")
  fruits.map(print)
}
