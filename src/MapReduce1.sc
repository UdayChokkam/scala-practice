

object mapreduce {

  def mapreduce(f: Int => Int, combine : (Int, Int) => Int, initial : Int)(a:Int, b :Int):Int ={
    if (a > b) initial
    else
      combine(f(a),mapreduce (f,combine, initial)(a+1, b))

  }

  mapreduce(x => x,(x, y) => x*y, 1)(1,5)

  mapreduce(x => x,(x, y) => x+y, 0)(1,10 )



}