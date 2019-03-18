object ScalaReverseString {

  def main(args: Array[String]): Unit = {

    val str = "My name is abcd yM si"
    val strList = str.split(" ").toList
    for(i <- 0 to strList.size-1){
      val x = strList(i).reverse
      if(strList.contains(x)){
        println(x)
      }
    }
  }
}
