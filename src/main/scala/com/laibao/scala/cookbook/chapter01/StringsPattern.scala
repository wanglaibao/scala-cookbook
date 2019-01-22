package com.laibao.scala.cookbook.chapter01

object StringsPattern {

  def main(args: Array[String]): Unit = {
    val numPattern = "[0-9]+".r
    val address = "123 Main Street Suite 101"
    val match1 = numPattern.findFirstIn(address)
    println(match1.getOrElse())
    val matches = numPattern.findAllIn(address)
    println(matches)
    matches.foreach(println)

    val matches1 = numPattern.findAllIn(address).toList
    matches1.foreach(println)
  }
}
