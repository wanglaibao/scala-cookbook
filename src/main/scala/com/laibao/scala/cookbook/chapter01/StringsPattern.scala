package com.laibao.scala.cookbook.chapter01
import scala.util.matching.Regex
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



    val numPattern1 = new Regex("[0-9]+")
    val address1 = "123 Main Street Suite 101"
    val match11 = numPattern.findFirstIn(address)


    val numPattern12 = new Regex("[0-9]+")
    val address12 = "No address given"
    //val match111 = numPattern12.findFirstIn(address12)
    //print(s"match111 is ${match111}")



    val result = numPattern12.findFirstIn(address12).getOrElse("no match")
    println(s"result is $result")





    match1 match {
      case Some(str) => println(s"Found: $str")
      case None => println("none value found ")
    }

  }
}
