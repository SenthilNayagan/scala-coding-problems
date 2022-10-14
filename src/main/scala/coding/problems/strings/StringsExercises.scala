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
}

object StringsExercises extends App {
  val stringExercises = new StringsExercises()

  println(stringExercises.isAllCharsUnique("hello"))
}
