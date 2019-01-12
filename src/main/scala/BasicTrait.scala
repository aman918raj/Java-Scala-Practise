
/*
In scala, trait is a collection of abstract and non-abstract methods.
You can create trait that can have all abstract methods or some abstract and some non-abstract methods.
A variable that is declared either by using val or var keyword in a trait get internally implemented in the class that implements the trait.
Any variable which is declared by using val or var but not initialized is considered abstract.
 */
trait Printable{
  def print()
}

trait Showable{
  def show()
}

class A4 extends Printable with Showable {
  def print(): Unit ={
    println("I am inside prinatble")
  }

  def show(): Unit = {
    println("I am inside showable")
  }
}

trait TestPrint{
  def print()
  def show(): Unit ={
    println("This is show method")
  }
}

class A6 extends TestPrint{
  override def print(): Unit = {
    println("This is print method")
  }
}

object BasicTrait {
  def main(args:Array[String]){
    val a = new A4()
    a.print()
    a.show()

    val b = new A6()
    b.print()
    b.show()
  }
}

