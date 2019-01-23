package com.laibao.scala.cookbook.chapter02

object MathUtils {

  def approximatelyEqual(x: Double, y: Double, precision: Double) = {
    if ((x - y).abs < precision) true else false
  }
}
