import java.util.Scanner

object q1 {
  def main(args: Array[String]): Unit = {
    val scanner = new Scanner(System.in)
    println("Enter your name : ")
    val a = scanner.nextLine()
    println("My name is : " + a)
    val aArr = a.split("\\s")
    val inp = aArr.map(x => x.toInt)
    var arr1 = new Array[Int](inp.length - 1)
    println(inp)
    for (i <- 0 to inp.length - 2) {
      println(inp(i + 1) - inp(i))
      arr1(i) = inp(i + 1) - inp(i)
    }
    var arr2 = new Array[Int](inp.length - 1)

    for (i <- 0 to arr1.length - 1) {
      for (j <- 0 to inp.length - 2) {
        val a = inp(j) + arr1(i)
        val b = inp(j + 1) - arr1(i)
        if (a >= inp(j + 1) && b <= inp(j) && arr1(i) != 0) {
          println(arr1(i))
          arr2(i) = arr1(i)
        }
      }
    }
    println(arr2.min)

  }
}
