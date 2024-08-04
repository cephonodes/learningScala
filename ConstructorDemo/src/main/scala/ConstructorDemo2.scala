// デフォルト値を持つコンストラクター（Primary constructors）
class demoClass2(val a: Int = 99, val b: Double = 88.88, val c: String = "Hello Scala") {
  val x = a
  val y = b
  val z = c

  def addNumber(): Double = {
    x + y
  }

  println(s"x = ${x} and y = ${y} and z = ${z}")
}

object ConstructorDemo2 {
  def main(args: Array[String]): Unit = {
    println("Hello World")

    val demoObject1 = new demoClass2(5, 7.2, "Hello World!")
    val demoObject2 = new demoClass2()
    val demoObject3 = new demoClass2(25)
    val demoObject4 = new demoClass2(c = "Hello")
  }
}
