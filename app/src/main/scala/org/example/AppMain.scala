package org.example

object AppMain {
  def main(args: Array[String]): Unit = {
    val service = AppService("World")
    println(service.run())
  }
}
