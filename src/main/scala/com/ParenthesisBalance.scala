package com

import scala.collection.mutable.Stack

object ParenthesisBalance {

  def main(args: Array[String]): Unit = {

    val x = "{([])}{()}[]()"

    val mp = Map('(' -> ')', '{' -> '}', '['->']')
    val s = new Stack[Char]

   // s.pop()
    val i = 0
    for(c <- x.toCharArray){
      mp.get(c)
    }

  }
}
