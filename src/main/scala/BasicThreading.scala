/*
Runnable has a single method that returns no value.

trait Runnable {
  def run(): Unit
}

Callable is similar to run except that it returns a value

trait Callable[V] {
  def call(): V
}
*/

object BasicThreading extends App {

  val hello = new Thread(new Runnable {
    def run() {
      println("hello world")
    }
  })

}
