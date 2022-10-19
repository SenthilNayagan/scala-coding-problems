package coding.problems.sorting

/**
 * Sorting exercises.
 *
 * Various sort algos:
 * Selection sort
 * Binary sort
 * Merge sort
 * Radix sort
 * Insertion sort
 */
class SortingExercises {

  /**
   * Sorting the given sequence without using library's sort methods.
   *
   * @param seq to be sorted
   * @return sorted sequence
   */
  def manualSorting(seq: Array[Int]): Array[Int] =
    var i = 0
    val len = seq.length

    while (i < len - 1) {
      if (seq(i) > seq(i + 1))
        val temp = seq(i)
        seq(i) = seq(i + 1)
        seq(i + 1) = temp
        i = -1
      i += 1
    }
    seq
}

object SortingExercises extends App {
  val sort = new SortingExercises()

  sort.manualSorting(Array(3, 1, 9, 4, 8)).foreach(print)
}
