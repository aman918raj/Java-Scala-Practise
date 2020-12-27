object Fibonacci {

  def main(args: Array[String]): Unit = {

    val i = tailRecFib(6)
    val x = fibTail2(6, 0, 1)
    println(i)
    println(x)
  }

  def tailRecFib(n: Int): Int = {

    def fibTail(n: Int, curr: Int, prev: Int): Int = {
      if (n == 0)
        return curr
      else
        return fibTail(n - 1, prev, prev + curr)
    }

    return fibTail(n, 0, 1)
  }

  def fibTail2(n: Int, curr: Int, prev: Int): Int = {
    if (n == 0)
      return curr

    println(curr)

    return fibTail2(n - 1, prev, prev + curr)
  }

}
