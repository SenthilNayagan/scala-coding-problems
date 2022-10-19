package coding.problems

/**
 * Duplicate exercises
 */
class Duplicates {

  /**
   * Finding duplicates elements without using library's duplicate method.
   *
   * @param nums
   * @return list of duplicates
   */
  def findDuplicatesInListOfInt(nums: List[Int]): List[Int] = {
    val tempMap = nums.groupBy(identity).mapValues(_.size).toMap
    tempMap.filter((t) => t._2 > 1).keys.toList
  }

  def findDuplicateUsingSorting(nums: List[Int]): List[Int] = {
    // TODO
    nums.sorted
  }

  /**
   * Finding deuplicates using Hash Map. Note that this approach takes space.
   *
   * Time complexity: ?
   * Space complexity: O(n)
   * @param nums
   * @return
   */
  def findDuplicatesUsingHashMap(nums: List[Int]): List[Int] = {
    // Define an empty Map to know the frequency
    val freq = scala.collection.mutable.Map[Int, Boolean]()

    var duplicates = Array[Int]()

    for (e <- nums) {
      if (freq.get(e).isEmpty)
        freq(e) = true
      else
        if (!duplicates.contains(e))  // Ensure to add only one occurrence of the duplicates
          duplicates = duplicates :+ e
    }
    duplicates.toList
  }
}

object Duplicates extends App {
  val dup = new Duplicates()
  dup.findDuplicatesInListOfInt(List(1, 2, 5, 2, 8, 2, 8)).foreach(print)
  println; dup.findDuplicatesInListOfInt(List(1, 2, 5, 8, 3)).foreach(print)

  println; dup.findDuplicatesUsingHashMap(List(1, 2, 5, 2, 8, 2, 8)).foreach(print)
}
