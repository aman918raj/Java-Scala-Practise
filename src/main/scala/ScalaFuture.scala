package com.bdf.datalake.ph.testClasses


import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global
import scala.collection.JavaConverters
import scala.collection.mutable.ListBuffer

object ScalaFuture {

  def main(args: Array[String]): Unit = {

    def divide(): List[Int] = {
      val list = List(2, 0, 5)
      val lb = new ListBuffer[Int]
      list.foreach { x =>
        if (x == 0) {
          throw new Exception("divided by 0")
        }
        val i = 100 / x
        lb.append(i)
      }
      println(lb)
      lb.toList
    }

    val f = Future {
      /*Thread.sleep(Random.nextInt(500))*/
      val list = divide()
      println(list)
      if (divide()(1) < 0) {
        //System.exit(1)
        throw new Exception("test123")
      } else divide()

    }
    f onSuccess {
      case result => println(s"Success: $result")
    }
    f onFailure {
      case t => println(s"Exception: ${t.getMessage}")
    }
    // do the rest of your work
    println("A ...");
    Thread.sleep(100)
    println("B ...");
    Thread.sleep(100)
    println("C ...");
    Thread.sleep(100)
    println("D ...");
    Thread.sleep(100)
    println("E ...");
    Thread.sleep(100)
    println("F ...");
    Thread.sleep(100)

  }

}

