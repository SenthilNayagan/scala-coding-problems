package coding.problems.collections.sequences

/**
 * Seq exercises.
 *
 * By default, Seq creates a List, as shown below:
 * scala> val x = Seq(1,2,3)
 * val x: Seq[Int] = List(1, 2, 3)
 *
 */
object SequenceExercises extends App {
  // Creating a sequence.
  val x = Seq(1,2,3)  // x: Seq[Int] = List(1, 2, 3)

  // Creating index sequence.
  // By default, IndexedSeq creates a Vector, as shown below.
  val y = IndexedSeq(1,2,3)  // val y: IndexedSeq[Int] = Vector(1, 2, 3)
}
