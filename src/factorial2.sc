object factorial2 {

  def factorial(num: Int): Int = {

    def loop(acc: Int, num: Int): Int = {
      if (num == 0) acc
      else loop(acc * num, num - 1)
    }

    loop(1,num)
  }
  factorial(5)
}