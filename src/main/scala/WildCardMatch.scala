import com.yevdo.jwildcard.JWildcard

object WildCardMatch {

  def main(args: Array[String]): Unit = {

    val filename = "ph_pack-mfg_additional_01062020.xlsx"
    val filePattern = "ph_pack-*_additional_*.xlsx"
    val mt = JWildcard.matches(filePattern, filename)

    println(mt)
  }
}
