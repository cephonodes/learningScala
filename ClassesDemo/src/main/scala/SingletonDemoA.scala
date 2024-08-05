// シングルトン
object DemoObjectB {
  val x = 2
  val y = 5.5

  def addValue(): Double = x + y

  println(s"x = ${x}, y = ${y}")
}

object SingletonDemoA {
  def main(args: Array[String]): Unit = {
//    val demoObjectB1 = new DemoClassB   // オブジェクトはインスタンス化できない。
    println(DemoObjectB.x, DemoObjectB.y)   // オブジェクトのメンバーには、「オブジェクト名.メンバー名」でアクセスする。
    val result = DemoObjectB.addValue()
    println(result)
  }
}
