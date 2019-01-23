package com.laibao.scala

package object cookbook {

  implicit class StringImprovements(val str: String) {
    def increment:String = str.map(c => (c+1).toChar)

    def decrement:String = str.map(c => (c-1).toChar)

    def hideAll:String = str.replaceAll(".", "*")

    def plusOne:Int = str.toInt + 1

    def asBoolean:Boolean = str match {
      case "0" | "zero" | "" | " " => false
      case _ => true
    }
  }

}
