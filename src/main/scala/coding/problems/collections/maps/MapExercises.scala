package coding.problems.collections.maps

/**
 * Map is an iterable collection of key-value pairs, where each key must be unique.
 * Scala defines two kinds of Maps:
 * 1. Immutable Map (default)
 * 2. Mutable Map (Explicitly needs to import scala.collection.mutable.Map)
 *
 * Mutable transform mutates in-place and mutable transform doesn't change the type (key) of the map.
 */
object MapExercises extends App {
  // Creating Map
  // Creating empty immutable Map
  val emptyMap1: Map[Int, String] = Map.empty[Int, String]  // One way of creating an empty Map
  //val emptyMap2: Map[Int, String] = Map[Int, String].apply()  // Another way of creating an empty Map
  val emptyMap3 = scala.collection.mutable.Map[Int, String]()  // Another way of creating an empty Map using parentheses

  // Inserting key-value into a mutable Map
  emptyMap3(1) = "Hello"
  emptyMap3(2) = "World"

  // mapValues vs. transform
  val m: Map[String, Int] = Map("a" -> 2, "b" -> 3)
  m.mapValues(_ * 5)  // collection.MapView[String, Int] = MapView(("a", 10), ("b", 15))
  m.transform((k, v) => v * 5)  // Map[String, Int] = Map("a" -> 10, "b" -> 15)

  // Any sequence to Map using groupBy
  // In order to convert to Map, we need to find ways to group sequence with count or size or something
  val seq: List[Int] = List(1, 2, 5, 2, 8, 2, 8)
  val map1 = seq.groupBy(identity).mapValues(_.size).toMap  // Uses identify function
  val map2 = seq.groupBy(e => e).mapValues(_.size).toMap  // Without identity function
}
