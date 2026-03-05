package org.example

class AppService(greeter: Greeter) {
  def run(): String = greeter.greet()
}

object AppService {
  def apply(name: String): AppService = new AppService(Greeter(name))
}
