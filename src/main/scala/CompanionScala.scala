object CompanionScala {

  def main(args: Array[String]): Unit = {

    val companionScala = new CompanionScala
    println(companionScala.sum(1,2))
  }

}

class CompanionScala{

  private def sum(a:Int, b:Int): Int ={
    val c = a + b
    return c
  }
}
