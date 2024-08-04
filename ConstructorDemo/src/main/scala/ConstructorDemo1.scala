// パラメーターありのコンストラクター（Primary constructors）
class demoClass1(val a: Int, val b: Double, val c: String) {
  val x = a
  val y = b
  val z = c

  def addNumber(): Double = {
    x + y
  }

  println(s"x = ${x} and y = ${y} and z = ${z}")
}

object ConstructorDemo1 {
  def main(args: Array[String]): Unit = {
    println("Hello World")

    val demoObject1 = new demoClass1(5, 7.2, "Hello World!")
    val demoObject2 = new demoClass1(6, 3.3, "Hello World Again!")

    println(demoObject1.x, demoObject1.y, demoObject1.z)
    val result1 = demoObject1.addNumber()
    println(s"result1 = ${result1}")

    println(demoObject2.x, demoObject2.y, demoObject2.z)
    val result2 = demoObject2.addNumber()
    println(s"result2 = ${result2}")
  }
}
