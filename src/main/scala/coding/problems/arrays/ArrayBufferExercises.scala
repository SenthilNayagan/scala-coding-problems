package coding.problems.arrays

import scala.collection.mutable.ArrayBuffer

/**
 * ArrayBuffer exercises
 *
 * Unlike Array, ArrayBuffer size can grow.
 */
object ArrayBufferExercises extends App {
  val arrayBuffer:ArrayBuffer[Int] = ArrayBuffer(0, 1, 2, 3, 4, 5, 6)

  // Define empty ArrayBuffer
  val strings = ArrayBuffer[String]()
  val ints = ArrayBuffer[Int]()

  // map functions
  arrayBuffer.map(_ * 2).foreach(print)

  // InPlace operations
  // All mutable collections, including Arrays, have in-place versions of many common collection operations.
  // These allow us to perform the operation on the mutable collection without having to make a transformed copy.
  val numSeq: ArrayBuffer[Int] = ArrayBuffer(10, 20, 30)
  numSeq.mapInPlace(_ / 2)
  print("\nInPlace operations\n")
  numSeq.foreach(print)

  // Using FilterInPlace
  numSeq.filterInPlace(_ % 2 == 0)
  print("\nFilterInPlace operations\n")
  numSeq.foreach(print)
}
