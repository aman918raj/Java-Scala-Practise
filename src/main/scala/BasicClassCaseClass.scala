class BankAccount {

  private var balance = 0

  def deposit(amount: Int): Unit = {
    if (amount > 0) balance = balance + amount
  }

  def withdraw(amount: Int): Int =
    if (0 < amount && amount <= balance) {
      balance = balance - amount
      balance
    } else throw new Error("insufficient funds")
}

case class Note(name: String, duration: String, octave: Int)

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
  jackAccount == bobAccount
  println(jackAccount)

  val d4 = Note("D", "Quarter", 4)
  val cThree = Note("C", "Quarter", 3)

  d4 == cThree

  println(d4)

}
