package coding.problems.fibonacci

import scala.collection.mutable.ArrayBuffer

class FibonacciSequence {

  /**
   * Finding  fibonacci sequence from 0 to n using iteration.
   *
   * @param n
   * @return
   */
  def findFibonacciSeqUsingIteration(n: Int): Int = {
    var (first, second) = (1, 2)
    var count = 0

    while (count < n) {
      val sum = first + second
      first = second
      second = sum
      count += 1
    }
    first
  }

  /**
   * Finding fibonacci sequence from 0 to n using recursion.
   *
   * Caution: Recursion only works well if n is small, otherwise we get a stack overflow exception.
   *
   * @param n
   * @return list of all fibonacci sequence from 0 to n
   */
  def findFibonacciSeqRecursion(n: Int): Int = n match {
    case 0 | 1 => n
    case _ => findFibonacciSeqRecursion(n - 1) + findFibonacciSeqRecursion(n - 2)
  }
}

object FibonacciSequence extends App {
  val fibonacciSeq = new FibonacciSequence()

  println(fibonacciSeq.findFibonacciSeqUsingIteration(5))
  println(fibonacciSeq.findFibonacciSeqRecursion(5))
}
