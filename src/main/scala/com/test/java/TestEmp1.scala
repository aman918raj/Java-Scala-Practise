package com.test.java

import com.examples.EmpDetails

object TestEmp1 {

  def main(args: Array[String]): Unit = {

    val emp = EmpValues.initVal()
    println(emp)
    TestEmp2.testCls(emp)
    println(emp)
  }


}
