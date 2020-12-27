package com

import scala.util.control.Breaks._

object solution {
  def main(args: Array[String]): Unit = {
    val in = scala.io.StdIn
    val n = in.readInt()
    for (_ <- 0 until n) {
      val s1 = in.readLine()
      val s2 = in.readLine()
      compareStr(s1, s2)
    }
  }

  def compareStr(s1: String, s2: String): Unit = {

    val s1Arr = s1.toCharArray
    val s2Arr = s2.toCharArray
    var str = ""
    var idx = ""
    var cnt = 0
    var out = "YES"

    for (i <- 0 until s1Arr.length) {
      if (s2Arr.contains(s1Arr(i))) {
        str += s1Arr(i)
        idx += "," + i.toString
      }
    }
    val idxLst = idx.split(",").filter(x => x != "").map(x => x.toInt).toList
    var lst = ""
    breakable {
      for (i <- 1 until idxLst.length) {
        if (idxLst.size <= 1) {
          out = "NO"
          break
        }
        val diff = idxLst(i) - idxLst(i - 1)
        if (diff > 1) {
          out = "YES"
          cnt += 1
          lst += "0"
        } else if (diff <= 1) {
          cnt = 0
          out = "NO"
        }
      }
    }
    if (str.contains(s2) && "YES".equalsIgnoreCase(out))
      println("YES")
    else
      println("NO")

  }
}
