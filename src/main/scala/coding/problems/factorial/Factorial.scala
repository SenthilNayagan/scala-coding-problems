package coding.problems.factorial

class Factorial {

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

  println(factorial.findFactorialUsingRecursive(5))
  println(factorial.findFactorialUsingBruteForce(5))
}
