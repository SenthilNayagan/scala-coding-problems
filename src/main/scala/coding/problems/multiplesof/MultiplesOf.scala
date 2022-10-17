package coding.problems.multiplesof

class MultiplesOf() {
  /**
   * Find multiples of 3 and 5 from 1 to upper range.
   *
   * @param upperRange
   * @return
   */
  def findSumOfMultiplesOf3And5(upperRange: Int): Int =
    (1 to upperRange).filter(e => (e % 3) == 0 || (e % 5) == 0).sum

}

object MultiplesOf extends App {
  val multiplesOf = new MultiplesOf()

  println(multiplesOf.findSumOfMultiplesOf3And5(10))
}
