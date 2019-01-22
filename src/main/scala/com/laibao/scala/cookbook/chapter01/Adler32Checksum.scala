package com.laibao.scala.cookbook.chapter01

object Adler32Checksum {

  val MOD_ADLER = 65521

  def main(args: Array[String]): Unit = {

    val sum = adler32sum("Wikipedia")

    printf("checksum (int) = %d", sum)
    println()
    println()
    printf("checksum (hex) = %s", sum.toHexString)

  }

  def adler32sum(s: String): Int = {
    var a = 1
    var b = 0
    s.getBytes.foreach{char =>
      a = (char + a) % MOD_ADLER
      b = (b + a) % MOD_ADLER
    }
    // note: Int is 32 bits, which this requires
    b * 65536 + a // or (b << 16) + a
  }
}
