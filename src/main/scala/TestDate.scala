import java.text.SimpleDateFormat
import java.util.{Calendar, Date}
import scala.util.control.Breaks._


object TestDate {

  def main(args: Array[String]): Unit = {
    val initDate: Date = new SimpleDateFormat("yyyyMM").parse("202003")
    breakable {
      for (i <- -5 to 0) {
        val c = Calendar.getInstance()
        c.setTime(initDate)
        c.add(Calendar.MONTH, i)
        val date = c.getTime
        println(c.getTime.toString)
        val formatter = new SimpleDateFormat("yyyy-MM")
        val date1 = formatter.format(date)
        println(date1)
        if (date1 <= "2017-01")
          break()
      }
    }
  }

}
