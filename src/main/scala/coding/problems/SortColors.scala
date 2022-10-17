package coding.problems

/**
 * Sort an array with n objects colored red, white, or blue. Sort them in-place so that lists of the
 * same color are adjacent, with colors in the order red, white, and blue.
 *
 * Use integers 0, 1, and 2 to represent the color red, white, and blue respectively.
 *
 * Note: Solve this without the library's sort function.
 */
class SortColors {

  def sortColors(nums: Array[Int]): Array[Int] = {
    val n = nums.size

    var first, mid = 0
    var last = n - 1

    while (mid <= last) {
      if (nums(mid) == 0) {
        val t = nums(mid)
        nums(mid) = nums(first)
        nums(first) = t
        //nums.updated(first, nums(mid)).updated(mid, nums(first))
        first += 1
        mid += 1
      }
      else if (nums(mid) == 1) {
        mid += 1
      }
      else if (nums(mid) == 2) {
        val t = nums(last)
        nums(last) = nums(mid)
        nums(mid) = t
        //nums.updated(last, nums(mid)).updated(mid, nums(last))
        last -= 1
      }
    }
    nums
  }
}

object SortColors extends App {
  val sortColors = new SortColors()

  sortColors.sortColors(Array(2, 0, 2, 1, 1, 0)).foreach(print)
  println(); sortColors.sortColors(Array(2, 0, 1)).foreach(print)
}
