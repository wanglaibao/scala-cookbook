package com.laibao.scala.cookbook.chapter01

object StringsApp extends App {
  val strName = "Hello, world".getClass.getName
  val strCanonicalName = "Hello, world".getClass.getCanonicalName
  val strSimpleName = "Hello, world".getClass.getSimpleName
  val strTypeName = "Hello, world".getClass.getTypeName
  println(s"strName is $strName")
  println()
  println(s"strCanonicalName is $strCanonicalName")
  println()
  println(s"strSimpleName is $strSimpleName")
  println()
  println(s"strTypeName is $strTypeName")
}
