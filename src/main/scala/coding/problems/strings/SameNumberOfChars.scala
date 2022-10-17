package coding.problems.strings

/**
 * Sherlock considers a string to be valid if all characters of the string appear the same number of times.
 * It is also valid if he can remove just  character at  index in the string, and the remaining characters
 * will occur the same number of times.
 */
class SameNumberOfChars {

  def method1(str: String): Boolean = {
    //str.map(x => x)

    true
  }
}

object SameNumberOfChars extends App {
  val strObj = new SameNumberOfChars()

  println(strObj.method1("abc"))
}