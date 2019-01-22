package com.laibao.scala.cookbook.chapter01

object StringInterpolation extends App {

  val name = "金戈"
  val age = 100
  val weight = 200.00
  println(s"$name is $age years old, and weighs $weight pounds.")
  println()
  println(s"Age next year: ${age + 1}")
  println()
  println(s"You are 33 years old: ${age == 33}")

  println()

  val student = Student("金戈",200)
  println(s"${student.name} has a score of ${student.score}")
  println()
  println(s"$student.name has a score of $student.score")

  println()
  println(f"$name is $age years old, and weighs $weight%.2f pounds.")
  println()

  println(f"$name is $age years old, and weighs $weight%.0f pounds.")

  val out = f"$name, you weigh $weight%.0f pounds."
  println(out)

}
