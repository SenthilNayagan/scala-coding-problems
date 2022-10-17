package coding.problems.collections.maps

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

  // mapValues vs. transform
  val m: Map[String, Int] = Map("a" -> 2, "b" -> 3)
  m.mapValues(_ * 5)  // collection.MapView[String, Int] = MapView(("a", 10), ("b", 15))
  m.transform((k, v) => v * 5)  // Map[String, Int] = Map("a" -> 10, "b" -> 15)

  // Mutable transform mutates in-place
  // Mutable transform doesn't change the type (key) of the map
}
