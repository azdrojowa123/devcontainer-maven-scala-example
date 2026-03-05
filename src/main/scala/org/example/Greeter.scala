package org.example

class Greeter(val name: String) {
  def greet(): String = s"Hello, $name!"

  def add(a: Int, b: Int): Int = a + b
}

object Greeter {
  def apply(name: String): Greeter = new Greeter(name)
}