object BasicMapReduceOperations extends App{

  val r = 1 to 100
  val l = r.toList

  //Get sum of squares of all even numbers
  val filter = l.filter(x => (x % 2 == 0))
  println(filter)
  val square = filter.map(x => x*x)
  println(square)

  //To get sum, conventional approach is :
  var total = 0
  for(i <- square)
    total += i
  println(total)

  //Get sum using reduce operation :
  val sum = square.reduce((total,element) => total + element)
  println(sum)

  //using api
  val sum1 = square.sum
  println(sum1)
}