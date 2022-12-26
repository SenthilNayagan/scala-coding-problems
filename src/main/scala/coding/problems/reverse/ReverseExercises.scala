package coding.problems.reverse

import scala.annotation.tailrec

/**
 * Reverse exercises.
 */
class ReverseExercises {

  /**
   * Reverse List items using functional programming approach.
   *
   * @param seq
   * @tparam T
   * @return
   */
  def reverseListItems[T](seq: List[T]): List[T] =
    seq.foldLeft(List[T]()) { (f, n) => n :: f}

  /**
   * Reverse List items using recursion.
   *
   * How it works:
   * input: List(3, 5, 6)
   * Output: List(6, 5, 3)
   *
   * h=3    tail=List(5, 6)   reverseListUsingRecursion(5, 6) ::: 3 = List(5, 6, 3)
   * h=5    tail=List(6)      reverseListUsingRecursion(6) ::: 5 ::: 3 = List(6, 5, 3)
   * h=6    tail=List()       reverseListUsingRecursion() ::: 6 ::: 5 ::: 3 = List(6, 5, 3)
   *
   * @param seq
   * @tparam T
   * @return
   */
  def reverseListUsingRecursion[T](seq: List[T]): List[T] = seq match {
    case Nil => Nil
    case h :: tail => reverseListUsingRecursion(tail) ::: List(h)
  }

  /**
   * Reverse List items using tail-recursion.
   *
   * How it works:
   * input: List(3, 5, 6)
   * Output: List(6, 5, 3)
   *
   * h=3    tail=List(5, 6)   reverseTR(3 :: Nil, List(5, 6))
   * h=5    tail=List(6)      reverseTR(5 :: 3 :: Nil, List(6))
   * h=6    tail=List()       reverseTR(6 :: 5 :: 3 :: Nil, List())
   *
   * @param seq
   * @tparam T
   * @return
   */
  def reverseListUsingTailRecursion[T](seq: List[T]): List[T] = {
    @tailrec  // To be used for compiler optimization
    def reverseTR(result: List[T], currentList: List[T]): List[T] = currentList match {
      case Nil => result
      case h :: tail => reverseTR(h :: result, tail)
    }
    reverseTR(Nil, seq)
  }
}

object ReverseExercises extends App {
  val rev = new ReverseExercises

  rev.reverseListItems(List(1, 2, 3)).foreach(print)  // 321
  rev.reverseListUsingRecursion(List(1, 2, 3)).foreach(print)  // 321
  rev.reverseListUsingTailRecursion(List(1, 2, 3)).foreach(print)  // 321
}
