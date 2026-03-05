package org.example

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class GreeterJUnitTest {

  @Test
  def testGreet(): Unit = {
    val greeter = Greeter("World")
    assertEquals("Hello, World!", greeter.greet())
  }

  @Test
  def testAdd(): Unit = {
    val greeter = Greeter("Test")
    assertEquals(5, greeter.add(2, 3))
  }

  @Test
  def testAddNegative(): Unit = {
    val greeter = Greeter("Test")
    assertEquals(-1, greeter.add(2, -3))
  }
}
