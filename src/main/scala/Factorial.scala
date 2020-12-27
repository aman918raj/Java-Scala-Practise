object Factorial {

  def main(args: Array[String]): Unit = {

    val i = tailRecFact(5,1)
    println(i)
  }

  def tailRecFact(n:Int, a:Int ): Int ={
    if(n == 0)
      return a
    tailRecFact(n-1 , a * n)
  }

}
