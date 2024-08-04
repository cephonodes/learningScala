// Primary constructors
class demoClass {
  val x = 3
  val y = 2

  def addNumber(): Int = {
    x + y
  }

  println(s"x = ${x} and y = ${y}")   // このコードは、このクラスがインスタンス化された時に実行される。

  val z = addNumber()
  println(s"z = ${z}")
}

object ConstructorDemo {
  def main(args: Array[String]): Unit = {
    println("Hello World")

    val demoObject1 = new demoClass
  }
}
