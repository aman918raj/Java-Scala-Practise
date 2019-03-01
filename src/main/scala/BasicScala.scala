object BasicScala {

  /*
  val evaluates when defined, def - when called
  lazy val evaluates when called the first time
  val evaluates when defined.

def evaluates on every call,
so performance could be worse than val for multiple calls.
You'll get the same performance with a single call.
And with no calls you'll get no overhead from def, so you can define it even if you will not use it in some branches.

With a lazy val you'll get a lazy evaluation:
you can define it even if you will not use it in some branches,
and it evaluates once or never, but you'll get a little overhead from double check locking on every access to your lazy val
   */
  def main(args:Array[String]){

    val s = "Hello World"

    //range
    val range = 1 to 100
    println(range)

    val list = List(4,99,2,1)
    println(list.fold(1){(z,i) => z+i})

    var sum = 0
    //for loop
    for(i <- (0 to s.length())){
      sum +=i
    }
    println(sum)

    //for loop
    var lb = 0
    val ub = 100
    var sumEven = 0
    var sumOdd = 0
    while(lb <= ub){
      if(lb % 2 == 0)
        sumEven += lb
      else
        sumOdd += ub
      lb += 1
    }
    println(sumEven)
    println(sumOdd)
  }
}