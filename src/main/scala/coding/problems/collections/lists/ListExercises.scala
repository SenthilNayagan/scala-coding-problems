package coding.problems.collections.lists

/**
 * List exercises.
 *
 * Note that List takes a relatively long time, because that request has to traverse all those elements. Better to
 * use or consider Vector instead.
 */

class ListExercises {
  /**
   * Finding last element in a List using recursion.
   *
   * Notes:
   * init function represents the initial part of the collection without its last element.
   * Nil represents the last element in a List.
   * tail represents all elements in a List except the first one.
   *
   * @param seq given List
   * @tparam T generic type
   * @return last element
   */
  def findLastUsingRecursion[T](seq: List[T]): T = seq match {
    case l :: Nil => l
    case _ :: tail => findLastUsingRecursion(tail)
    case _ => throw new NoSuchElementException
  }

  /**
   * Finding last but one element in a List using recursion.
   * Nil represents the last element in a List.
   * tail represents all elements in a List except the first one.
   *
   * @param seq given List
   * @tparam T generic type
   * @return last but one element
   */
  def findLastButOneUsingRecursion[T](seq: List[T]): T = seq match {
    case lbo :: _ :: Nil => lbo
    case _ :: tail => findLastButOneUsingRecursion(tail)
    case _ => throw new NoSuchElementException
  }

  /**
   * Finding Kth element of a List using recursion.
   *
   * @param i Kth position
   * @param ls given list
   * @tparam T generic type
   * @return Kth element or value
   */
  def findKthElement[T](i: Int, ls: List[T]): T = (i, ls) match {
    case (0, h :: _) => h
    case (n, _ :: tail) => findKthElement(n - 1, tail)
    case (_, Nil) => throw new NoSuchElementException
  }
}
object ListExercises extends App {
  val list = new ListExercises

  val hetroList: List[Any] = List(1.0, "Hello", 6, true)  // Type is of Any in case of heterogeneous items in a List.
  val numList: List[Int] = List(2, 1, 5, 3, 8, 7, 9)

  // Prepending and appending item to List
  // : character represents the side that the sequence is on
  "Hi" +: hetroList  // List[Any] = List("Hi", 1.0, "Hello", 6, true)
  hetroList :+ 'i'  // List[Any] = List(1.0, "Hello", 6, true, 'i')

  // Iterating items/elements of a List
  for item <- hetroList do println(item)

  // Another way of constructing a List
  val names: List[String] = "John" :: "Joe" :: "Sam" :: Nil  // Should be suffixed with Nil.

  // Find first element in a List
  hetroList(0)
  numList(0)

  // Find last element in a List
  hetroList.last
  numList.last
  println(list.findLastUsingRecursion(names))

  // Find last but one in a List
  println(list.findLastButOneUsingRecursion(names))
  println(names.init.last)  // Using library function

  // Find Kth element in a List
  println(list.findKthElement(2, names))
}
