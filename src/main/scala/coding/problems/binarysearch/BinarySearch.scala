package coding.problems.binarysearch

import coding.problems.arrays.ArraysExercises.numbers

class BinarySearch {

  /**
   * Performing binary search using recursive approach.
   *
   * Time complexity: O(log n)
   * Space complexity: O(1)
   *
   * @param nums list of integer numbers
   * @param searchItem element to be searched
   * @param startIndex starting index of the list
   * @param endIndex ending index of the list
   * @return index of the searchItem, if found. Otherwise, returns -1
   */
  def binarySearchUsingRecursive(nums: List[Int], searchItem: Int)
                                (startIndex: Int = 0, endIndex: Int = nums.length -1): Int = {
    if (startIndex > endIndex) -1

    // Finding middle index
    var midIndex = startIndex + (endIndex - startIndex) / 2  // Need clarification: Can this be endIndex / 2?

    if (nums(midIndex) == searchItem) midIndex
    else if (nums(midIndex) > searchItem)
      binarySearchUsingRecursive(nums, searchItem)(startIndex, midIndex - 1)
    else
      binarySearchUsingRecursive(nums, searchItem)(midIndex + 1, endIndex)
  }


}

object BinarySearch extends App {
  val numbers: List[Int] = List(5, 2, 8, 7, 3, 1, 9, 4, 6).sorted
  val searchItem = 7

  val binarySearch = new BinarySearch

  println(binarySearch.binarySearchUsingRecursive(numbers, searchItem)() match {
    case -1 => s"$searchItem doesn't exist"
    case index => s"$searchItem exists at index $index"
  })
}