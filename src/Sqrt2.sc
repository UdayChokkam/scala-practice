object sqrt2 {

  def sqrt(num: Double): Double = {

    def sqrtIter(guess: Double): Double =
      if (IsGoodGuess(guess)) guess
      else sqrtIter(improve(guess))

    def IsGoodGuess(guess: Double): Boolean =
      math.abs(guess * guess - num) < 0.0001

    def improve(guess: Double): Double =
      (guess + (num / guess)) / 2

    sqrtIter(1.0)
  }
  sqrt(2)

}