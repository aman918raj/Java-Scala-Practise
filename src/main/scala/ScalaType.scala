object ScalaType{

  def main(args: Array[String]): Unit = {

    def highOrdFunc(f : Int => Int, name : String): Unit ={
      println(f(2))
      println(name)
    }

    highOrdFunc(i => i*i, "Aman")

    val obj = new testTraitClass
    obj.printSomething("Aman in class")
    obj.sum(3,4)

  }

}

class testTraitClass() extends test {

  override def printSomething(value: String): Unit = super.printSomething(value)

  override def sum(x: Int, y: Int): Unit = super.sum(x, y)
}

trait test{

  def printSomething(value : String): Unit ={
    println(value)
  }

  def sum(x : Int, y:Int): Unit ={
    println(x+y)
  }
}
