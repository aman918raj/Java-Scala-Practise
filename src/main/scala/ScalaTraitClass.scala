trait BaseSoundPlayer {
  def play
  def close
  def pause
  def stop
  def resume
  def speak {println("Hello")}
}
//Its not necessary to declare non-abstract method
class Mp3SoundPlayer extends BaseSoundPlayer {
  def play   {}
  def close  {}
  def pause  {}
  def stop   {}
  def resume {}
}
//If a class extends a trait but does not implement the methods defined in that trait, it must be declared abstract
// must be declared abstract because it does not implement BaseSoundPlayer methods
abstract class JavaSoundPlayer extends BaseSoundPlayer {
  def play   {}
  def close  {}
}

abstract class Animal {
  def speak
}

trait WaggingTail {
  def startTail
  def stopTail
}

trait FourLeggedAnimal {
  def walk
  def run
}

class Dog extends Animal with WaggingTail with FourLeggedAnimal {
  // implementation code here ...
  override def startTail: Unit = println("wave tail")

  override def stopTail: Unit = println("stop tail")

  override def run: Unit = println("run")

  override def walk: Unit = println("walk")

  override def speak: Unit = println("speak")
}

object ScalaTraitClass {

  def main(args: Array[String]): Unit = {
    val test = new Dog()
    test.run

  }

}
