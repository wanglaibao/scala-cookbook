package com.laibao.scala.cookbook.chapter01

/**
  * It’s an oversimplification to say that this functionality comes from the StringOps class,
  *  but it’s a useful illusion. The reality is that some of this functionality comes from
  * StringOps , some comes from StringLike , some from WrappedString , and so on. If
  * we dig into the Scala source code, you’ll see that the rabbit hole goes deep, but it begins
  * with the implicit conversion from String to StringOps in the Predef object.
  */
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

  println("------------------------------------------------------------")
  println("------------------------------------------------------------")
  println("------------------------------------------------------------")


  val s = "Hello, world"
  println(s.length)

  val s1 = "Hello" + " world"

  // we can iterate over every character in the string using the foreach method:
  "hello".foreach(println)

  // we can treat a String as a sequence of characters in a for loop
  for (c <- "hello") println(c)

  // we can also treat it as a sequence of bytes:

  s.getBytes.foreach(println)

  // Because there are many methods available on sequential collections, you can also use other functional methods like filter

  val result = "hello world".filter(_ != 'l')
  println(s"the result is $result")

  println()

  println("scala".drop(2).take(2).capitalize)


  "jingealading".getBytes.foreach(println)
}
