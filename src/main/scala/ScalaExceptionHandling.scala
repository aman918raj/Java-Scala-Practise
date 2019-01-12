
class CustomException(s:String) extends Exception{}
class ExceptionHandle1{

  def createExp(a:Int, b:Int): Unit ={
    a/b
  }
}

class ExceptionHandle2{

  @throws(classOf[CustomException])
  def createExp(a:Int): Unit ={

    if(a > 0){
      throw new CustomException("This is a Custom Exception")
    }
    else{
      println(a)
    }
  }
}

object ScalaExceptionHandling {

  def main(args: Array[String]): Unit = {

    val exceptionHandle1 = new ExceptionHandle1
    val a = 100
    val b = 0
    try{
      exceptionHandle1.createExp(a,b)
    }
    catch {
      case e:ArithmeticException => println(e)
    }

    println( a+b)

    val exceptionHandle2 = new ExceptionHandle2
    try{
      exceptionHandle2.createExp(a)
    }
    catch {
      case e:Exception => println("Exception Occured : " + e)
    }
  }
}
