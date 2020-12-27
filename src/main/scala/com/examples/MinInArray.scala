package com.examples

object MinInArray {

  def main(args: Array[String]): Unit = {
    val arr = Array(1, 2, 3)
    val y = solution(arr)
    println(y)
  }

  def solution(a: Array[Int]): Int = {

    var i = 1
    var y = 1
    a.toList.sorted.foreach{ x=>
      if(i == x){
        i +=1
      }else{
        y = i
      }
    }
    if(a.contains(y)) {
      y = i
    }
    return y
  }

}
