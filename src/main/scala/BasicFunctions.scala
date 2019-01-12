object BasicFunctions {

  def main(args:Array[String]){

    //Simple functions
    def sum(lb:Int, ub:Int) = {
      var total = 0
      for(i <- lb to ub){
        total += i
      }
      total
    }
    println(sum(1,10))

    def sum1(lb:Int, ub:Int):Int = {
      var total = 0
      for(i <- lb to ub){
        total += i
      }
      return total
    }
    println(sum1(1,10))

    /*passing function to a function as argument
     * this type of function which takes in other function is called Higher Order Function
     * In this case complexSum is Higher Order Function
     */
    def value(i:Int)= i
    def square(i:Int)= i*i
    def cube(i:Int)= i*i*i
    def complexSum(func : Int => Int, lb:Int, ub:Int)={
      var total = 0
      for(i <- (lb to ub)){
        total += func(i)
      }
      total
    }
    println(complexSum(value, 1, 10))
    println(complexSum(square, 1, 10))
    println(complexSum(cube, 1, 10))

    /*Anonymous Function : are those which do not have names associated with it
     * We can provide functionality while invoking a function using Anonymous Function
     * in this case i => i or i => i*i or i => i*i*i is Anonymous Function
     */
    def complexSum2(func : Int => Int, lb:Int, ub:Int) ={
      var total = 0
      for(i <- (lb to ub)){
        total += func(i)
      }
      total
    }
    println(complexSum2(i => i, 1, 10))
    println(complexSum2(i => i*i, 1, 10))
    println(complexSum2(i => i*i*i, 1, 10))
    val out = complexSum(i => {
      if(i%2 == 0){
        i*i
      }
      else{
        i*2
      }
    }, 1, 10)
    println(out)
  }

  /*
  val evaluates when defined.

def evaluates on every call, so performance could be worse than val for multiple calls.
You'll get the same performance with a single call.
And with no calls you'll get no overhead from def, so you can define it even if you will not use it in some branches.

With a lazy val you'll get a lazy evaluation: you can define it even if you will not use it in some branches,
 and it evaluates once or never, but you'll get a little overhead from double check locking on every access to your lazy val.
   */

}