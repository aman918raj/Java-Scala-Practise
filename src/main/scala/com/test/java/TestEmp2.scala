package com.test.java

import com.examples.EmpDetails

object TestEmp2 {

  def testCls(emp: EmpDetails): Unit ={
    EmpValues.changeValue(3000,emp)
    println(emp)
  }

}
