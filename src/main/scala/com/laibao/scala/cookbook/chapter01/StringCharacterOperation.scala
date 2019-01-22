package com.laibao.scala.cookbook.chapter01

object StringCharacterOperation extends App {

  val upper1 = "hello,world".map(char => char.toUpper)
  println(upper1)

  val upper2 = "hello, world".map(_.toUpper)
  println(upper2)


  val upper3 = "hello, world".filter(char => char != 'l').map(char => char.toUpper)
  println(upper3)

  val upper4 = "hello, world".filter(_ != 'l').map(_.toUpper)
  println(upper4)


  val upper5 = for (c <- "hello, world") yield c.toUpper
  println(upper5)



  val result = for {
    c <- "hello, world"
    if c != 'l'
  } yield c.toUpper

  println(result)


  // first example
  "HELLO".map(c => (c.toByte+32).toChar)

  // second example
  "HELLO".map{
    c =>(c.toByte+32).toChar
  }


  def toLower(c: Char): Char = (c.toByte+32).toChar
  "HELLO".map(toLower)


  val s = "HELLO"
  for (c <- s) yield toLower(c)



  val toLower1 = (c: Char) => (c.toByte+32).toChar
  println(toLower1)

  "HELLO".map(toLower1)

}
