import scala.util.control.TailCalls.TailRec

object gcd1 {

  @TailRec
  def gcd(a:Double , b:Double): Double =
    if (b == 0) a else gcd(b ,a%b)

  gcd(21,56)

}