package com.laibao.scala.cookbook.chapter02

object LargeNumber {

  def main(args: Array[String]): Unit = {
    val a = BigInt(1234567890)

    val b = BigInt(1234567890)

    val c = a + b

    println(s"a is $a and b is $b and c is $c")


    val d = c toInt

    println(s"d is $d")
  }
}
