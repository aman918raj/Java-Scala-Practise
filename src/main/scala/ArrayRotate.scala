object ArrayRotate {

  def main(args: Array[String]): Unit = {

    var arrayOfNum:Array[Int] = Array(1,3,5,9,6)

    val arrayOfIndex:Array[Int] = Array(1,3,4,5,6)

    var index = 0

    for(i <- 0 to arrayOfIndex.size){
      var x = 0
      var y = 0

      index = i

      for(j <- 1 to arrayOfNum.size){
        //      println(arrayOfNum(i-1))
        if(x < arrayOfNum(j-1)){
          x = arrayOfNum(j-1)
          y = j-1
        }
      }
      rotateLeft(index,x,y)

    }

    def rotateLeft(rotateBy:Int, currentIndex:Int, indexOfMaxNum:Int): Unit ={

      var indexOfMaxNumAfterRotation = indexOfMaxNum - rotateBy
      println(indexOfMaxNumAfterRotation)
    }
  }

}
