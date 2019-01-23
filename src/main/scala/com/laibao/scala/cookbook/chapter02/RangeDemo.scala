package com.laibao.scala.cookbook.chapter02

object RangeDemo extends App {

  val range1 = 1 to 100

  val range2 = 1 to 100 by 2

  val range3 = 1 to 10 by 3

  for (element <- range1) println(element)
  println()

  range1.foreach(println)
  println()

  for (element <- range2) {
    println(element)
  }
  println()

  range2.foreach(println)
  println()

  for (element <- range3) {
    println(element)
  }
  println()

  range3.foreach(println)
  println()


  val array = 1 to 10 toArray

  val list = 1 to 10 toList

  val x = (1 to 10).toList

  val y = (1 to 10).toArray

}
