object BasicCollections extends App{

  /*
   * Scala collections are of 3 types Seq, Set, Map, Array , List
   * All three are interfaces
   * All the data structures which stores as sequence of elemnt are charaterized under Seq
   * All the data structers which stores unique elements are characterized under Set
   * All the data structures which stores key-value pair are characterized under Map
   */

  //Array
  val a = Array(1,2,3,4)
  a.iterator.foreach(println)
  val l = List(6,8,1,2,3,4)
  println(l)
  val s = Set(7,7,7,1,1,1,2,2,3,4,4,4)
  println(s)
  s.iterator.foreach(println)
  val m = Map("Hello" -> 1, "World" -> 2)
  println(m)
  m.iterator.foreach(println)
  println(m.get("Hello"))
  println(m.get("dwd"))

  val m1:Map[String,String] = Map("Hello" -> "Hi", "World" -> "Earth");
  println(m1.get("Hello"))

  /*
  * Scala tries to solve the problem of nulls by getting rid of null values altogether and by providing a type
  to represent an optional/unknown value, i.e. Option[Employee].
  * In this case, Option is a holder for an optional value of type Employee. If the value of type Employee is present,
  the Option[Employee] is an instance of Some[Employee], representing a value of type Employee. If the value is absent,
  the Option[Employee] is the object None.
  * The advantage of having an Option type is that developers are forced to deal with nulls during compile time,
  rather than dealing with nulls during runtime.
   */

  val indxSeq:IndexedSeq[String] = IndexedSeq()
}
