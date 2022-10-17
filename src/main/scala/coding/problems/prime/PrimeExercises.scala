package coding.problems.prime

/**
 * Prime number is number that has exactly two factors i.e., 1 and the number itself.
 * For example, 7 is a prime number, because it has only two factors, which are 1 and 7.
 *
 * Note: 1 is not a prime number. For a number to be called as a prime number, it must have only
 * two positive factors. In case of 1, the number of factors is ONLY ONE. Hence, 1 is not a prime number.
 *
 * Composite numbers:
 * Whole numbers that are not prime are called composite numbers. Note that composite numbers
 * are composed of prime numbers.
 *
 * Prime factorization:
 * Is a set of prime numbers that we multiply together to get another number.
 *
 * How we find out what prime numbers a composite number is made of.
 */
class PrimeExercises {
  /**
   * Check if the given number is prime or not.
   *
   * @param n given input number.
   * @return true if it's prime, otherwise returns false.
   */
  def isPrime(n: Int): Boolean = {
    if (n <= 1)
      false
    else if (n == 2)
      true
    else
      !(2 until n).exists(x => (n % x) == 0)
  }

}

object PrimeExercises extends App {
  val prime = new PrimeExercises

  println(prime.isPrime(5))

  println((1 to 6).filter(prime.isPrime))
}
