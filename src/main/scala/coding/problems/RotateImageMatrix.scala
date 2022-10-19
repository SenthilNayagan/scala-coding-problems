package coding.problems

/**
 * Rotating image matrix.
 *
 * Multi-dimensional array:
 * val arrayname = Array.ofDim[data_type](number of rows, number of cols)
 * or
 * var arrayname = Array(Array(elements), Array(elements))
 * Exmaple: var x = Array[Array[Int]] = Array(Array(1, 2, 3), Array(4, 5, 6), Array(7, 8, 9))
 */
class RotateImageMatrix {

  /**
   * Rotating 90 degree.
   * Input:
   * | 1 2 3 |
   * | 4 5 6 |
   * | 7 8 9 |
   *
   * Output:
   * | 7 4 1 |
   * | 8 5 2 |
   * | 9 6 3 |
   */
  def rotateNinetyDegree(matArray: Array[Array[Int]]): Array[Array[Int]] = {
    val rotated = matArray.transpose
    for (i <- 0 until rotated.length)
      rotated(i) = rotated(i).reverse
    rotated
  }
}

object RotateImageMatrix extends App {
  val rotateImgMat = new RotateImageMatrix()
  var x = Array(Array(1, 2, 3), Array(4, 5, 6), Array(7, 8, 9))

  val out = rotateImgMat.rotateNinetyDegree(x)

  for (i <- 0 to out.length - 1) {
    for (j <- 0 to out.length - 1) {
      print(out(i)(j))
    }
    println()
  }

}
