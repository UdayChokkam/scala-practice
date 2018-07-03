object sum {

 def sumF(f : Int => Int): (Int , Int) => Int = {

   def sum(a: Int, b: Int): Int = {

   if (a > b) 0
   else f(a) + sum(a + 1, b)
 }
   sum
  }

  sumF( x => x)(1,5)

}