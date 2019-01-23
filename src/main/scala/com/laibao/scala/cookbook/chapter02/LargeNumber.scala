package com.laibao.scala.cookbook.chapter02

import scala.util.Random
object LargeNumber {

  def main(args: Array[String]): Unit = {
    val a = BigInt(1234567890)

    val b = BigInt(1234567890)

    val c = a + b

    println(s"a is $a and b is $b and c is $c")


    val d = c toInt

    println(s"d is $d")


    val random = new Random

    random.nextInt

    random.nextBoolean

    random.nextLong

    random.nextFloat

    random.nextDouble

    random.nextInt(100)

    random.nextPrintableChar


    val intRange = 0 to new Random().nextInt(100)
    intRange.foreach(println)



    val range = for (i <- 0 to random.nextInt(1000)) yield i * 2

    range.foreach(println)

  }
}
