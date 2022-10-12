package coding.problems.arrays

object ArraysExercises extends App{
  // Declare array of integers
  var numbers: Array[Int] = Array(0, 1, 2, 3, 4, 5, 6, 7, 8, 9)

  // Print all items of an array
  numbers.foreach(print)

  // Fetch array item by index
  print("\n"); println(numbers(2))

  // Map functions
  numbers.map(_ * 2).foreach(print)  // Double each integer item in an array without the need of any variable.
  val doubled_numbers = numbers.map(x => x * 2)  // Other way of doing the same, but with a new variable.
  print("\nDoubled items in an array\n"); doubled_numbers.foreach(print)

  // Adding two arrays
  val numSet1: Array[Int] = Array(0, 1, 2, 3, 4, 5)
  val numSet2: Array[Int] = Array(6, 7, 8, 9)
  print("\nAdding two arrays\n"); (numSet1 ++ numSet2).foreach(print)

  // Sorting an array
  val unsortedNums: Array[Int] = Array(7, 2, 9, 3, 1, 4, 0, 8)
  print("\n"); unsortedNums.sorted.foreach(print)
}
