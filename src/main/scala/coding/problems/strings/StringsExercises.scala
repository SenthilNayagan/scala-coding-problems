package coding.problems.strings

/**
 * Strings exercises
 */
class StringsExercises {

  /**
   * Checks if all the characters in the given string are unique.
   *
   * @param str
   * @return
   */
  def isAllCharsUnique(str: String): Boolean = {
    val ht = scala.collection.mutable.Map[Char, Boolean]()

    for (c <- str) {
      if (ht.contains(c))
        return false
      else
        ht.put(c, true)  // Also, use ht += (c -> true)
    }
    true
  }

  /**
   * Finding the counts of unique strings in a list of array strings as shown below:
   *
   * Input:
   * List("Hello world", "hi", "how do you do", "i am fine", "hello there", "how are you")
   *
   * Output:
   * Map (
   * "hello" -> 2,
   * "world" -> 1,
   * "hi" -> 1,
   * "how" -> 2,
   * ..
   * ..
   * )
   *
   * List
   *
   * @return
   */
  def listofStringCounts(strings: List[String]): Map[String, Int] = {
    strings.map(e => e.split(" ")).flatten.groupBy(e => e.toLowerCase).mapValues(_.size).toMap
  }
}

object StringsExercises extends App {
  val stringExercises = new StringsExercises()

  println(stringExercises.isAllCharsUnique("hello"))

  val strings = List("Hello world", "hi", "how do you do", "i am fine", "hello there", "how are you")
  stringExercises.listofStringCounts(strings).foreach(println)
}
