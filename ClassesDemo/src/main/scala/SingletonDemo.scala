class DemoClassA(a: Int, b: Double) {
  val x = a
  val y = b

  def addValue(): Double = x + y

  println(s"x = ${x}, y = ${y}")
}

object SingletonDemo {
  def main(args: Array[String]): Unit = {
    var demoObjectA1 = new DemoClassA(5, 7.7)
    println(demoObjectA1.x, demoObjectA1.y)
    var result = demoObjectA1.addValue()
    println(result)

    demoObjectA1 = new DemoClassA(3, 2.2)
    println(demoObjectA1.x, demoObjectA1.y)
    result = demoObjectA1.addValue()
    println(result)
  }
}
