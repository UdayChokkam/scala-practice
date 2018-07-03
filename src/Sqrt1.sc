object sqrt1 {

  def sqrt(num: Double): Double = sqrtIter(1.0, num)

  def sqrtIter(guess: Double, num: Double): Double =
    if (IsGoodGuess(guess, num)) guess
    else sqrtIter(improve(guess, num),num)

  def IsGoodGuess(guess: Double, num: Double): Boolean =
    math.abs(guess * guess - num) < 0.0001

  def improve(guess: Double, num: Double): Double =
    (guess + (num/guess))/2

  sqrt(2)

}