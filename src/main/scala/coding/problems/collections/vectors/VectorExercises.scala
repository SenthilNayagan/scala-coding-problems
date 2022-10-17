package coding.problems.collections.vectors

/**
 * Vector exercises
 *
 * Vector is an indexed, immutable sequence.
 *
 * Vectors to be considered if we want to prepend and append elements. Put is simply, Vector provides
 * fast append and prepend times.
 *
 * Unlike List, we can use Vector to access the large elements by their index value. List takes a relatively
 * long time, because that request has to traverse all those elements. However, this is not the case with Vector.
 */
object VectorExercises extends App {
  // Defining an empty Vector
  val emptyVec: Vector[Int] = Vector[Int]()

  val x: Vector[Int] = Vector(1, 2, 3, 4, 5)
  println(x(0))

  x.updated(1, 6)  // Vector(1, 6, 3, 4, 5)

}
