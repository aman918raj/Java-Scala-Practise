import java.text.SimpleDateFormat
import java.util.Calendar

import scala.collection.mutable.ListBuffer

object ScalaExcpetion {

  def main(args: Array[String]): Unit = {

   val div = divNum(10, 0)
    println(div)
  }

  def divNum(a: Int, b: Int): Int = {
    try {
      val div = a / b
      return div
    } catch {
      case e: ArithmeticException => {
        println(e.getMessage)
        return addNum(a, b)
      }
    }
  }

  def addNum(a: Int, b: Int): Int = {
    val sum = a + b
    return sum
  }


}
