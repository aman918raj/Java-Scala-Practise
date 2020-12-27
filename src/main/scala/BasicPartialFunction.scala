object BasicPartialFunction extends App {

  /*
  A simple function like def double(x: Int) = x*2 can be considered a total function as there is no input x that
  the double() function could not process.However there are some functions that do not support every possible value
  that meets the input type. For example, a function that returns the square root of the input number will not work
  if the input number is negative. Similarly a division function with 0 in denominator isn’t applicable.
  Such functions are called partial functions because they can only partially apply to their input data.
   */

  val divide = new PartialFunction[Int,Int] {
    def apply(x: Int) = 42 / x
    def isDefinedAt(x: Int) = x != 0
  }

  val x = divide.isDefinedAt(0)
  println(x)
  //divide.apply(0)
}
