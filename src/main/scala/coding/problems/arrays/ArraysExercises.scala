package coding.problems.arrays

/**
 * Array exercises
 *
 * Array in scala is homogeneous and mutable.
 */
object ArraysExercises extends App {
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

  // Use parenthesis to add one or more expressions
  print("\n"); numbers.map({print("Hello"); _ * 3}).foreach(print)
  print("\n"); numbers.map{print("Hello"); _ * 3}.foreach(print)  // Scala lets us omitting the () as well

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

  // InPlace operations
  // All mutable collections, including Arrays, have in-place versions of many common collection operations.
  // These allow us to perform the operation on the mutable collection without having to make a transformed copy.
  val numSeq:Array[Int] = Array(10, 20, 30)
  numSeq.mapInPlace(_ / 2)
  print("\nInPlace operations\n"); numSeq.foreach(print)

  // Sum operations
  // Unlike reduce methods, fold methods has initial value.
  // reduceLeft and reduceRight cumulate a single result.
  // foldLeft and foldRight cumulate a single result using a start value.
  // scanLeft and scanRight cumulate a collection of intermediate cumulative results using a start value.
  print("\n"); println(numSeq.reduce(_ + _))
  numSeq.reduceLeft(_ + _)
  numSeq.reduceRight(_ + _)

  print("\n"); println(numSeq.fold(1)(_ + _))  // Adds 1 to the sum value.
  numSeq.foldLeft(1)(_ + _)  // Iterates from left
  numSeq.foldRight(1)(_ + _)  // Iterates from right

  print(s"\n numSeq = $numSeq")
  // Source sequence = 1, 2, 3
  // scan output = 1, 2, 4, 7
  print("\n"); numSeq.scan(1)(_ + _).foreach(print)

  // Implicit conversions
  // In Scala, an array does not pretend to be a sequence, because the data type representation
  // of a native array is not a subtype of Seq.
  // Instead there is an implicit “wrapping” conversion between arrays and instances of
  // class scala.collection.mutable.ArraySeq, which is a subclass of Seq.
  val a1: Array[Int] = Array(3, 5, 7, 6, 9)
  val seq: scala.collection.Seq[Int] = a1  // seq: collection.Seq[Int] = ArraySeq(3, 5, 7, 6, 9)

}
