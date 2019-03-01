
class ConstructorExample1{

  def main(args: Array[String]): Unit = {

  }
  println("Hello: This is default primary constructor")
}

class ConstructorExample2(var id:String){
  this.id = id
  def test(): Unit ={
    println("test of method " + id)

  }
}

class ConstrunctorExample3(var id:String){
  val constructorExample2 = new ConstructorExample2(id)
}
object ScalaConstructor {

  def main(args: Array[String]): Unit = {

    val constructorExample1 = new ConstructorExample1

    val constructorExample2 = new ConstructorExample2("abc123")
    println(constructorExample2.id)
    constructorExample2.test()

    val construnctorExample3 = new ConstrunctorExample3("xyz111")
    println(construnctorExample3.id)

  }
}
