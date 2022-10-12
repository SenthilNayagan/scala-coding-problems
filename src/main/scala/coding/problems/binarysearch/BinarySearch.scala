package coding.problems.binarysearch

import coding.problems.arrays.ArraysExercises.numbers

import scala.annotation.tailrec

class BinarySearch {

  /**
   * Performing binary search using non-tail-recursion approach.
   * The stack depth (size) is more for Non-tail-recursive methods. Before doing the actual calculation, each
   * recursive call must be finished.
   *
   * Time complexity: O(log n)
   * Space complexity: O(n) - Because with every call to the recursive function, the state is saved on the call stack.
   *
   * @param nums list of integer numbers
   * @param searchItem element to be searched
   * @param startIndex starting index of the list
   * @param endIndex ending index of the list
   * @return index of the searchItem, if found. Otherwise, returns -1
   */
  def binarySearchUsingRecursion(nums: List[Int], searchItem: Int)
                                (startIndex: Int = 0, endIndex: Int = nums.length -1): Int = {
    if (startIndex > endIndex) -1

    // Finding middle index
    var midIndex = startIndex + (endIndex - startIndex) / 2  // Need clarification: Can this be endIndex / 2?

    if (nums(midIndex) == searchItem) midIndex
    else if (nums(midIndex) > searchItem)
      binarySearchUsingRecursion(nums, searchItem)(startIndex, midIndex - 1)
    else
      binarySearchUsingRecursion(nums, searchItem)(midIndex + 1, endIndex)
  }

  /**
   * Performing binary search using tail-recursion approach. The tail recursive functions better than non tail
   * recursive functions because tail-recursion can be optimized by compiler. A recursive function is said to be
   * tail recursive if the recursive call is the last operation performed by the function. There is no need to
   * keep record of the previous state.
   *
   * For tail recursion function the following package to imported: scala.annotation.tailrec
   *
   * @param nums       list of integer numbers
   * @param searchItem element to be searched
   * @return index of the searchItem, if found. Otherwise, returns -1
   */
  def binarySearchUsingTailRecursion(nums: List[Int], searchItem: Int): Int = {
    /**
     *
     * @param nums list of integer numbers
     * @param searchItem element to be searched
     * @param startIndex starting index of the list
     * @param endIndex ending index of the list
     * @return index of the searchItem, if found. Otherwise, returns -1
     */
    @tailrec def bsHelper(nums: List[Int], searchItem: Int, startIndex: Int, endIndex: Int): Int = {
      if (startIndex > endIndex) -1

      // Finding middle index
      val midIndex = startIndex + (endIndex - startIndex) / 2

      nums(midIndex) match {
        case i if (i == searchItem) => midIndex
        case i if (i > searchItem) => bsHelper(nums, searchItem, startIndex, midIndex - 1)
        case _ => bsHelper(nums, searchItem, midIndex + 1, endIndex)
      }
    }
    // Calling the helper
    bsHelper(nums, searchItem, 0, nums.length - 1)
  }

}

object BinarySearch extends App {
  val numbers: List[Int] = List(5, 2, 8, 7, 3, 1, 9, 4, 6).sorted
  val searchItem1 = 7
  val searchItem2 = 3

  val binarySearch = new BinarySearch

  println(binarySearch.binarySearchUsingRecursion(numbers, searchItem1)() match {
    case -1 => s"$searchItem1 doesn't exist"
    case index => s"$searchItem1 exists at index $index"
  })

  println(binarySearch.binarySearchUsingTailRecursion(numbers, searchItem2) match {
    case -1 => s"$searchItem2 doesn't exist"
    case index => s"$searchItem2 exists at index $index"
  })

}