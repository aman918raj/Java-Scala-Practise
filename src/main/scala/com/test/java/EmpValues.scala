package com.test.java

import com.examples.EmpDetails

object EmpValues {

  def initVal(): EmpDetails ={
    val emp = EmpDetails(1,"A",1000)
    return emp
  }

  def changeValue(sa:Int, empDetails: EmpDetails): Unit ={
    empDetails.sal = sa
  }

}
