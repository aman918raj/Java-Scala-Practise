object BasicScala {

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