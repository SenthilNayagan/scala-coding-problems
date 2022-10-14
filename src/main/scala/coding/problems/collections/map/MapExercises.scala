package coding.problems.collections.map

/**
 * Map is an iterable collection of key-value pairs, where each key must be unique.
 * Scala defines two kinds of Maps:
 * 1. Immutable Map (default)
 * 2. Mutable Map (Explicitly needs to import scala.collection.mutable.Map)
 */
object MapExercises extends App {
  // Creating Map
  // Creating empty immutable Map
  val emptyMap1: Map[Int, String] = Map.empty[Int, String]  // One way of creating an empty Map
  //val emptyMap2: Map[Int, String] = Map[Int, String].apply()  // Another way of creating an empty Map
  val emptyMap3: Map[Int, String] = Map[Int, String]()  // Another way of creating an empty Map using parentheses
}
