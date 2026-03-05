package org.example

import org.scalatest.funsuite.AnyFunSuite

class GreeterScalaTest extends AnyFunSuite {

  test("greet returns correct greeting") {
    val greeter = Greeter("Scala")
    assert(greeter.greet() == "Hello, Scala!")
  }

  test("add returns sum of two numbers") {
    val greeter = Greeter("Test")
    assert(greeter.add(3, 4) == 7)
  }

  test("add handles zero") {
    val greeter = Greeter("Test")
    assert(greeter.add(0, 5) == 5)
  }
}
