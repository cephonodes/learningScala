// コンパニオンオブジェクト
class CompanionDemo {
  private val x = 5

  def getValue(): Unit = {
    // コンパニオンオブジェクトCompanionDemoのyはprivateだが、CompanionDemoクラスからアクセス可能。
    println(s"Value of X is: ${x} and value of y is: ${CompanionDemo.y}")
  }
}

object CompanionDemo {
  private val y = 2.2

  def main(args: Array[String]): Unit = {
    val objectForCompanionDemoClass = new CompanionDemo

    // CompanionDemoクラスのxはprivateだが、コンパニオンオブジェクトCompanionDemoからアクセス可能。
    println(s"Value of x when retrieved from companion object is ${objectForCompanionDemoClass.x}")

    // 自分自身が持っているメンバー変数には当然アクセス可能。
    println(s"Value of y when retrieved from companion object is ${y}")

    objectForCompanionDemoClass.getValue()
  }
}
