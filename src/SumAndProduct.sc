object sum {



  def sumOrProduct(f : (Int , Int )=> Int , a : Int, b :Int):Int = {

    f(a, b );

  }

  def sum (a : Int, b :Int) : Int = {

    if (a > b ) 0 else a + sum (a+1, b)
  }

  def product (a : Int, b :Int) : Int = {

    if (a > b ) 1 else a * product (a+1, b)
  }


  sumOrProduct(sum ,1, 10)
  sumOrProduct(product ,1, 10)


}