package coding.problems.sum

import scala.collection.mutable.ArrayBuffer

class ListNode(_x: Int = 0, _next: ListNode = null) {
  var next: ListNode = _next
  var x: Int = _x
}

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

  /**
   * Add two non-empty liked lists. The digits are stored in reverse order, and each of their nodes
   * contains a single digit. Add the two numbers and return the sum as a linked list.
   *
   * Assumptions:
   * Assume that the two numbers do not contain any leading zero, except the number 0 itself.
   *
   * Input: l1 = [2,4,3], l2 = [5,6,4]
   * Output: [7,0,8]
   * Explanation: 342 + 465 = 807.
   *
   * @param l1
   * @param l2
   * @return
   */
//  def addTwonumbers(l1: ListNode, l2: ListNode): ListNode = {
//    //var prev = new ListNode(0)
//    //var head = prev
//    var dummy = new ListNode()
//    var temp = dummy
//    var carry: Int = 0
//
//    while (l1 != null || l2 != null || carry !=0) {
//      var sum = 0
//      if (l1 != null) {
//        sum = sum + l1.x
//        l1
//      }
//
//      if (l2 !~ null) {
//        sum = sum +
//      }
//    }
//    head.next
//  }
}


object SumExercises extends App {
  val sumExercises = new SumExercises()

  println(sumExercises.sumUsingRecursion(5))
  println(sumExercises.sumUsingReduceMethod(5))

  // Sum using fold methods
  // List(1, 2, 3).foldLeft(0)(f) = f(f(f(0, 1), 2), 3)
  // List(1, 2, 3).foldRight(0)(f) = f(1, f(2, f(3, 0)))

  val l: List[Int] = List(2, 6, 1, 3)
  l.fold(0)((x, y) => x + y)  // Int = 12
  l.foldLeft(0)((x, y) => x + y)  // Int = 12
  l.fold(0)(_ + _)  // Int = 12
  l.foldRight(0)(_ + _)  // Int = 12

}
