package com

object ForLoop {

  def main(args: Array[String]): Unit = {

    for(i <- Range(0,100)){
      println(i)
    }
    val x = fibonacci(5)
    println(x)
  }

  def fibonacci(i : Int): Int ={
    if(i == 0){
      0
    } else if(i == 1){
      1
    } else{
      fibonacci(i-1) + fibonacci(i-2)
    }
  }
}
