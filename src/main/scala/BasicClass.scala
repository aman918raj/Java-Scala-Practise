object BasicClass extends App{

  /*What is constructor
   * A constructor in Java is a block of code similar to a method that’s called when an instance of an object is created. Here are the key differences between a constructor and a method:
A constructor doesn’t have a return type.
The name of the constructor must be the same as the name of the class.
Unlike methods, constructors are not considered members of a class.
A constructor is called automatically when a new instance of an object is created.
Here’s the basic format for coding a constructor:
public ClassName (parameter-list) [throws exception...]
{
    statements...
}
The public keyword indicates that other classes can access the constructor. ClassName must be the same as the name of the class that contains the constructor. You code the parameter list the same way that you code it for a method.
Notice also that a constructor can throw exceptions if it encounters situations that it can’t recover from.
A constructor allows you to provide initial values for class fields when you create the object. Suppose that you have a class named Actor that has fields named firstName and lastName. You can create a constructor for the Actor class:
public Actor(String first, String last)
{
    firstName = first;
    lastName = last;
}
Then you create an instance of the Actor class by calling this constructor:
Actor a = new Actor("Arnold", " Schwarzenegger");
A new Actor object for Arnold Schwarzenegger is created.
Like methods, constructors can be overloaded. In other words, you can provide more than one constructor for a class if each constructor has a unique signature. Here’s another constructor for the Actor class:
public Actor(String first, String last, boolean good)
{
    firstName = first;
    lastName = last;
    goodActor = good;
}
This constructor lets you create an Actor object with information besides the actor’s name:
Actor a = new Actor("Arnold", "Schwarzenegger", false);
If you do not provide a constructor for a class, Java will automatically create a default constructor that has no parameters and doesn’t initialize any fields. This default constructor is called if you specify the new keyword without passing parameters. For example:
Ball b = new Ball();
   */

  /*
   * Here class act as constructor in the below example which takes in arguments
   */
  class Order(orderId:Int, orderDate:String, orderCustomerId:Int, orderStatus: String){
    println("I am inside Order Constructor")
  }
  val order = new Order(1111,"2018-08-19",1211,"Success")

  /*
   * Function inside a class
   */
  class Order2(orderId:Int, orderDate:String, orderCustomerId:Int, orderStatus: String){
    println("I am inside Order2 Constructor")
    override def toString = "Order2("+ orderId + "," + orderDate + "," + orderCustomerId + "," + orderStatus + ")"
  }
  val order2 = new Order2(1111,"2018-08-19",1211,"Success")
  println(order2)
  /*
   * For the above class, internally Java has created the below class with constructor
   * public class $line5.$read$$iw$$iw$Order2 {
     private final int orderId;
  private final java.lang.String orderDate;
  private final int orderCustomerId;
  private final java.lang.String orderStatus;
  public java.lang.String toString();
  public $line5.$read$$iw$$iw$Order2(int, java.lang.String, int, java.lang.String);
}
* we cant use order2.orderId here as all members are private
       */
  /*
   * As we can see all the variables of class Order2 are private, we cant access them directly
   * To access the member variable we use the below class which has val in it
   */

  class Order3(val orderId:Int, val orderDate:String, val orderCustomerId:Int, val orderStatus: String){
    println("I am inside Order2 Constructor")
    override def toString = "Order2("+ orderId + "," + orderDate + "," + orderCustomerId + "," + orderStatus + ")"
  }
  val order3 = new Order3(1111,"2018-08-19",1211,"Success")
  println(order3.orderId)
  /*
   * Now for the above class our Java compiler creates the below class with constructor
   * public class $line8.$read$$iw$$iw$Order3 {
  private final int orderId;
  private final java.lang.String orderDate;
  private final int orderCustomerId;
  private final java.lang.String orderStatus;
  public int orderId();
  public java.lang.String orderDate();
  public int orderCustomerId();
  public java.lang.String orderStatus();
  public java.lang.String toString();
  public $line8.$read$$iw$$iw$Order3(int, java.lang.String, int, java.lang.String);
}
   *Basically all public methods created by Java compiler are getter methods
   * To create setter methods as well as getter we use var with variables in class defination as the below example
   */

  class Order4(var orderId:Int, var orderDate:String, var orderCustomerId:Int, var orderStatus: String){
    println("I am inside Order2 Constructor")
    override def toString = "Order2("+ orderId + "," + orderDate + "," + orderCustomerId + "," + orderStatus + ")"
  }
  val order4 = new Order4(1111,"2018-08-19",1211,"Success")
  println(order4.orderId)
  order4.orderId = 3333
  println(order4.orderId)

  /*
   * we can set our own values by using var which help us in creating getter as well as setter methods
   * we couldn't do it in case of val because val is immutable
   */
}