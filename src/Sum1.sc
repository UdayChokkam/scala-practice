object sum {

  def sumInts(a : Int, b :Int): Int = {
    if (a > b)  0 else sum(a) +sumInts(a+1, b)
  }
  def sumCubes(a : Int, b :Int): Int = {
    if (a > b)  0 else cube(a) +sumCubes(a+1, b)
  }

  def sumFactorials(a : Int, b :Int): Int = {
    if (a > b)  0 else factorial(a) +sumFactorials(a+1, b)
  }

  def sum (a : Int) : Int = a
  def cube (num : Int) : Int  = num * num *num;
  def factorial(i: Int) : Int =
    if (i == 0 ) 1 else i * factorial(i -1 )

  sumInts(1, 10)
  sumCubes(1, 5)
  sumFactorials(1, 4)
}