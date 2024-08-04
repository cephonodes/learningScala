// Auxiliary constructors（補助コンストラクター）
class demoClass3(val a: Int, val b: Double, val c: String) {
  val x = a
  val y = b
  val z = c

  println(s"Primary constructor says: x = ${x} and y = ${y} and z = ${z}")

  def addNumber(): Double = {
    x + y
  }

  // 補助コンストラクター
  def this() = {
    this(99, 88.88, "Hello Scala")
    println(s"I came into Auxiliary constructor with 0 parameters")
  }

  // これも補助コンストラクター
  def this(a: Int) = {
    this(a, 88.88, "Hello Scala")
    println(s"I came into Auxiliary constructor with 1 parameters")
  }

  // これも補助コンストラクター
  def this(a: Int, b: Double) = {
    this(a, b, "Hello Scala")
    println(s"I came into Auxiliary constructor with 2 parameters")
  }

  // 引数の数が他のコンストラクターと同じでも、引数の型が異なっていれば定義できる。
  def this(c: String) = {
    this(1, 66.66, c)
    println(s"I came into Auxiliary constructor with 1 parameters")
  }
}

object ConstructorDemo3 {
  def main(args: Array[String]): Unit = {
    val demoObject1 = new demoClass3(5, 7.2, "Hello World!")
    val demoObject2 = new demoClass3()
    val demoObject3 = new demoClass3(5)
    val demoObject4 = new demoClass3(5, 7.2)
    val demoObject5 = new demoClass3("Hello Java")
  }
}
