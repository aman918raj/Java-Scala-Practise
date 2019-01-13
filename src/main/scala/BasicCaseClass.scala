object BasicCaseClass extends App {

  /*
   * In case of case class if we dont define val or var with class variables then
   * it automatically treat it as val and also it implements Product and Serializable
   */
  /*
  * Limitation of case class: It can have only 22 members
  * */
  case class Order(orderId:Int, orderDate:String, orderCustomerId:Int, orderStatus: String){
    println("I am inside Order Constructor")
  }

  /*
   * We get below class if we use :javap -p Order in Terminal
   * public class $line10.$read$$iw$$iw$Order implements scala.Product,scala.Serializable {
  private final int orderId;
  private final java.lang.String orderDate;
  private final int orderCustomerId;
  private final java.lang.String orderStatus;
  public int orderId();
  public java.lang.String orderDate();
  public int orderCustomerId();
  public java.lang.String orderStatus();
  public $line10.$read$$iw$$iw$Order copy(int, java.lang.String, int, java.lang.String);
  public int copy$default$1();
  public java.lang.String copy$default$2();
  public int copy$default$3();
  public java.lang.String copy$default$4();
  public java.lang.String productPrefix();
  public int productArity();
  public java.lang.Object productElement(int);
  public scala.collection.Iterator<java.lang.Object> productIterator();
  public boolean canEqual(java.lang.Object);
  public int hashCode();
  public java.lang.String toString();
  public boolean equals(java.lang.Object);
  public $line10.$read$$iw$$iw$Order(int, java.lang.String, int, java.lang.String);
}
   * Serializable is required to save the object as byte stream or to transfer it over the network or to save it to a File System
   * Product is used to access the attributes of the object easily
   * In the above methods created by java, any method starting with copy is created for Serialization because it implements Serializable
   * Any method starting with product is created for Product because it implements product
   */

  /*
   * Let's see the example below with var
   */
  case class Order2(var orderId:Int, var orderDate:String, var orderCustomerId:Int, var orderStatus: String){
    println("I am inside Order2 Constructor")
  }

  /*
   * Java compiler creates the below code(we can see this in Terminal by using ":javap -p Order2") :
   * public class $line11.$read$$iw$$iw$Order2 implements scala.Product,scala.Serializable {
  private int orderId;
  private java.lang.String orderDate;
  private int orderDate;
  private java.lang.String orderStatus;
  public int orderId();
  public void orderId_$eq(int);
  public java.lang.String orderDate();
  public void orderDate_$eq(java.lang.String);
  public int orderCustomerId();
  public void orderCustomerId_$eq(int);
  public java.lang.String orderStatus();
  public void orderStatus_$eq(java.lang.String);
  public $line11.$read$$iw$$iw$Order2 copy(int, java.lang.String, int, java.lang.String);
  public int copy$default$1();
  public java.lang.String copy$default$2();
  public int copy$default$3();
  public java.lang.String copy$default$4();
  public java.lang.String productPrefix();
  public int productArity();
  public java.lang.Object productElement(int);
  public scala.collection.Iterator<java.lang.Object> productIterator();
  public boolean canEqual(java.lang.Object);
  public int hashCode();
  public java.lang.String toString();
  public boolean equals(java.lang.Object);
  public $line11.$read$$iw$$iw$Order2(int, java.lang.String, int, java.lang.String);
}
   * The difference in Order2 and Order is that variables (orderId, orderDate, orderDate, orderStatus) in Order
   * were final(can not be changed) because Order implemented val but Order 2 implements var
   * Anything with _$eq are setter methods
   */
  val order2 = Order2(1111,"2018-08-19",1211,"Success")
  println(order2.orderDate)
  println(order2.productArity) // returns 4 because we have 4 attributes
  println(order2.productElement(1)) // returns the nth element of the object
  order2.productIterator.foreach(println) // iterates through each attribute
  println(order2.productPrefix) // returns class name
}