package coding.problems.sum

class SumExercises {

  /**
   * Sum all numbers from 1 to n
   *
   * Time complexity: ?
   * Space complexity: ?
   *
   * @param n upper range
   * @return sum of all numbers between 1 and n
   */
  def sumUsingRecursion(n: Int): Int = {
    if (n <= 0) 0
    else n + sumUsingRecursion(n - 1)
  }
}

object SumExercises extends App {
  val sumExercises = new SumExercises()
  println(sumExercises.sumUsingRecursion(5))
}
