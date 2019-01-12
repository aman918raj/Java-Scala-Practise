

object BasicTuples {

  def main(args:Array[String]){

    //below is an example of how a tuple defined
    val t = (2,2,1073,1,199.99,199.99)
    println(t)
    println(t._6)
    //tuples also implements Product
    //tuples is also Serializable
    println(t.toString())
  }
}