package com.laibao.scala.cookbook.chapter02

import scala.util.Random

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

  println()
  println()
  println()

  var range = 0 to Random.nextInt(10)
  range.foreach(println)


  for (i <- 1 to 5) yield i * 2


  for (i <- 1 to 5) yield i.toDouble

}
