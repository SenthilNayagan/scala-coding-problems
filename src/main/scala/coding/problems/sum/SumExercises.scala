package coding.problems.sum

class SumExercises {

  /**
   * Sum all numbers from 1 to n
   *
   * Time complexity: O(n)
   * Space complexity: O(n) - Because with every call to the recursive function, the state is saved on the call stack.
   *
   * @param n upper range
   * @return sum of all numbers between 1 and n
   */
  def sumUsingRecursion(n: Int): Int = {
    if (n <= 0) 0
    else n + sumUsingRecursion(n - 1)
  }

  /**
   * Sum all numbers from 1 to n using reduce method
   *
   * Time complexity: O(n)
   * Space complexity: ?
   *
   * @param n upper range
   * @return sum of all numbers between 1 and n
   */
  def sumUsingReduceMethod(n: Int): Int = {
    (1 to n).reduce(_ + _)
  }
}

object SumExercises extends App {
  val sumExercises = new SumExercises()

  println(sumExercises.sumUsingRecursion(5))
  println(sumExercises.sumUsingReduceMethod(5))
}
