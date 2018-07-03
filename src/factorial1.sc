object factorial1 {

  def factorial(a:Double): Double =
    if (a == 1) 1 else  a * factorial(a - 1)

  factorial(5)

}