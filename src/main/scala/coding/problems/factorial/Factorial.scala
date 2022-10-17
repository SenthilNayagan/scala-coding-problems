package coding.problems.factorial


/**
 * Factorial is a multiply of all natural numbers from the the given number down to 1.
 * For example, factorial of 4 is 4 x 3 x 2 x 1 = 24
 */
class Factorial {

  /**
   * Finding factorial using reduce method
   *
   * Time complexity: ?
   * Space complexity: ?
   *
   * @param n
   * @return
   */
  def findFactorialUsingReduce(n: Int): Int = {
    (1 to n).reduce(_ * _)
  }

  /**
   * Finding factorial using recursive approach.
   *
   * Time complexity: O(n)
   * Space complexity: O(n) - Because with every call to the recursive function, the state is saved on the call stack.
   *
   * @param num the given number for which the factorial to be computed
   * @return calculated factorial value
   */
  def findFactorialUsingRecursive(num: Int): Int = {
    if (num == 1) 1
    else num * findFactorialUsingRecursive(num - 1)
  }

  /**
   * Finding factorial using brute-force approach. Here, we are mutating a value.
   *
   * Time complexity: O(n)
   * Space complexity: O(n) - Because with every call to the recursive function, the state is saved on the call stack.
   *
   * @param num the given number for which the factorial to be computed
   * @return calculated factorial value
   */
  def findFactorialUsingBruteForce(num: Int): Int = {
    var factorial = 1

    if (num == 1) 1
    else {
      for (i <- 1 to num)
        factorial *= i
    }
    factorial
  }

}

object Factorial extends App {
  val factorial = new Factorial

  println(factorial.findFactorialUsingReduce(5))
  println(factorial.findFactorialUsingRecursive(5))
  println(factorial.findFactorialUsingBruteForce(5))
}
