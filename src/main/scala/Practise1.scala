object Practise1 {

  def main(args:Array[String]): Unit ={

    val r = 1 to 100
    val list = r.toList
    val set = Set(9,9,9,3,2,3,5,5,3,1,1)
    val array : Array[Int] = r.toArray

    def sumArray(array : Array[Int]): Long ={
      var total = 0
      for(i <- array){
        total += i
      }
      total
    }

    def sumSet(set : Set[Int]): Int = {
    var total = 0
    for(i <- set){
      total += i
    }
    total
    }

    def test(list:List[Int],array:Array[Int],func : Int => Int ): Long ={
    var total = 0
      for(i <- array(5) to list(8)){
        total += i*func(i)
      }
      total
    }

    println(sumArray(array))
    println(sumSet(set))
    println(test(list,array, i => i/i))
    var order = new Order(1121, 90, 5)
    val totalAmount = order.orderTotal(90,5)
    println(totalAmount)

  }

}
class Order(var orderId : Int, var orderAmount : Int, var orderQuantity:Int){
  println("OrderId : " + orderId + "," + "OrderAmnout : " + orderAmount + "," + "OrderQuantity : " + orderQuantity)
  def orderTotal(orderAmount:Int, orderQuantity:Int): Long ={
    var total = orderAmount * orderQuantity
    total
  }
}
