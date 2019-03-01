class BankAccount {

  private var balance = 0

  def deposit(amount: Int): Unit = {
    if (amount > 0) balance = balance + amount
    return balance
  }

  def withdraw(amount: Int): Int =
    if (0 < amount && amount <= balance) {
      balance = balance - amount
      balance
    } else throw new Error("insufficient funds")
}
/*
  * Limitation of case class: It can have only 22 members
  */
case class Note(name: String, duration: String, octave: Int)

case class Person(name:String)
class PersonA(name:String)

object BasicClassCaseClass extends App {

  val aliceAccount = new BankAccount
  val c3 = Note("C", "Quarter", 3)
  //We see that creating a class instance requires the keyword new, whereas this is not required for case classes.
  //Also, we see that the case class constructor parameters are promoted to members, whereas this is not the case
  // with regular classes.

  println(c3)
  println(c3.name)

  val jackAccount = new BankAccount
  val bobAccount = new BankAccount
  bobAccount.deposit(60)
  println(bobAccount.withdraw(20))
  jackAccount == bobAccount
  println(jackAccount)

  val d4 = Note("D", "Quarter", 4)
  val cThree = Note("C", "Quarter", 3)

  d4 == cThree

  println(d4)

  val x = Person("Aman")
  val y = Person("Aman")
  val bool = x==y

  println(bool)

  val a = new PersonA("Aman")
  val b = new PersonA("Aman")

  val bool2 = a==b

  println(bool2)

}
