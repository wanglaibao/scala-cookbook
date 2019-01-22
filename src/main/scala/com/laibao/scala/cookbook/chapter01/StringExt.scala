package com.laibao.scala.cookbook.chapter01

object StringExt {

  def main(args: Array[String]): Unit = {

    val foo =
      """This is
 a multiline
 String"""
    //println(foo)

    println()
    println()


    val speech = """Four score and
                            |seven years ago""".stripMargin


    //println(speech)


    val speechTwo = """Four score and
#seven years ago""".stripMargin('#').replaceAll("\n", "")

    //println(speechTwo)
    println()


    val speechThree = """Four score and
                   #seven years ago
                   #our fathers""".stripMargin('#').replaceAll("\n", "")


    println(speechThree)



    val array = "hello world".split(" ")
    println(array.getClass.getName)

    array.foreach(println)
    println()

    "hello world".split(" ").foreach(println)
    println()


    "eggs , milk , butter , Coco Puffs ".split(",").map(_.trim).map(_.toUpperCase).foreach(println)

  }

}
