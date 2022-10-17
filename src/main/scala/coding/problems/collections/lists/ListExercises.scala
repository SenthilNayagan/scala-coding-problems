package coding.problems.collections.lists

/**
 * List exercises.
 *
 * Note that List takes a relatively long time, because that request has to traverse all those elements. Better to
 * use or consider Vector instead.
 */
object ListExercises extends App {
  val hetroList: List[Any] = List(1.0, "Hello", 6, true)  // Type is of Any in case of heterogeneous items in a List.

  // Prepending and appending item to List
  // : character represents the side that the sequence is on
  "Hi" +: hetroList  // List[Any] = List("Hi", 1.0, "Hello", 6, true)
  hetroList :+ 'i'  // List[Any] = List(1.0, "Hello", 6, true, 'i')

  // Iterating items/elements of a List
  for item <- hetroList do println(item)

  // Another way of constructing a List
  val names: List[String] = "John" :: "Joe" :: "Sam" :: Nil  // Should be suffixed with Nil.
}
