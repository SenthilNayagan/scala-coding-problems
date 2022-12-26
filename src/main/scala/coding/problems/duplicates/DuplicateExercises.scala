package coding.problems.duplicates

/**
 * Duplicate exercises.
 */
class DuplicateExercises {
  /**
   * Generates duplicates in such a way that if source is "aabccc" then the expected output is "aaaabbccc" i.e.,
   * double the occurrences of each character.
   *
   * @param List
   */
  def generateDuplicatess(s: List[Char]): List[Char] = {
    val mapped = s.sorted.groupBy(identity).mapValues(_.size).toMap.transform((k, v) => v * 2)
    mapped.toList.map(e => e._1.toString * e._2).flatten
  }
}

object DuplicateExercises extends App {
  val duplicates = new DuplicateExercises
  duplicates.generateDuplicatess(List('a', 'b', 'c', 'c', 'd')).foreach(print)
}
