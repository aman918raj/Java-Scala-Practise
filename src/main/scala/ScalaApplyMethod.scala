class ApplyTest(x:Double,y:Double){

  def apply(index:Int): Double = index match {

    case 0 => x
    case 1 => y
    case _ => throw new IndexOutOfBoundsException("value not found")
  }

  def f = () => math.random

}


object ScalaApplyMethod {

  def main(args: Array[String]): Unit = {

    // In the example below Array internally uses apply method Array(1,2,3) is equivalent to array.apply(1,2,3)
    val array:Array[Int] = Array(1,2,3)
    array.foreach(println)
    val arrayApply:Array[Int] = Array.apply(1,2,3)
    arrayApply.foreach(println)

    val applyTest = new ApplyTest(2.0,3.0)
    val out = applyTest.apply(0)
    println(out)

    println("*******************")
    println(applyTest.f())
    println(applyTest.f)
    println(applyTest.f.apply())
    println(applyTest.f)


  }

}
