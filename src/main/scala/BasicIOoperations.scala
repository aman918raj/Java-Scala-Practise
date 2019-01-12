import scala.io.Source

object BasicIOoperations {

  def main(args:Array[String]){
    val dataFile = Source.fromFile("/Users/amaraj0/data-master/retail_db/order_items/part-00000")
    /*
     * dataFile is of type scala.io.BufferedSource = non-empty iterator
     * In BufferedSource each element is a character
     */
    dataFile.take(10).foreach(println)

    val records = dataFile.getLines()
    records.take(10).foreach(println)
    println(records.size)

    /*
     * problem statement for the above file (dataFile) we need to extract order subtotal(Fifth Column)
     * and need to compute revenue for a orderId(Second column). For e.g for orderId 2
     */

    val order_items = Source.fromFile("/Users/amaraj0/data-master/retail_db/order_items/part-00000").getLines()
    val order_itemsFilter = order_items.filter(x => x.split(",")(1).toInt == 2)
    val order_itemsFilterMap = order_itemsFilter.map(x => x.split(",")(4).toFloat)
    val order_itemsFilterMapReduce = order_itemsFilterMap.reduce((total, element) => total + element)
    //we can also use order_itemsFilterMap.sum or order_itemsFilterMap.reduce(_ + _)
    println(order_itemsFilterMapReduce)
  }
}