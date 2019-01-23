package com.laibao.scala.cookbook.chapter02

object NumberExample{

  def toInt(s: String):Option[Int] = {
    try {
      Some(s.toInt)
    } catch {
      case e: NumberFormatException => None
    }
  }

  def main(args: Array[String]): Unit = {
    val MinValueOne = Short.MinValue

    val MaxValueOne = Short.MaxValue

    println(MinValueOne)
    println()
    println(MaxValueOne)

    "100".toInt

    "100".toDouble

    "100".toFloat

    "1".toLong

    "1".toShort

    "1".toByte

    val b = BigInt("1")


    val c = BigDecimal("3.14159")

    println(b)

    println(c)


    println(toInt("1").getOrElse(0)) // 1
    println(toInt("a").getOrElse(0)) // 0

    // assign the result to x
    val x = toInt("jinge").getOrElse(0)



    toInt("100000000") match {
      case Some(n) => println(n)
      case None => println("Boom! That wasn't a number.")
    }


    val result = toInt("111111111") match {
      case Some(x) => x
      case None => 0 // however you want to handle this
    }

    println(s" the result is $result")
  }





}
