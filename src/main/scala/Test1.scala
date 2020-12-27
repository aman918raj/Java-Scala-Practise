object Test1 {

  def main(args: Array[String]): Unit = {

    def deliveryCounts(i: Int): Unit = {
      println("x" + "x" + i)
      println("x" + "x" + i)
    }

    var total = 0
    deliveryCounts {
      total += 1
      total
    }
  }

}
