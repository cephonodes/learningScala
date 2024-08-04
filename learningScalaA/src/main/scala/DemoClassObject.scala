class Car {
  var topClassExtraCost = 0
  private var roadTax = 100

  def cost(basicCost: Int): Int = basicCost + topClassExtraCost + roadTax
  def checkTax() = {
    roadTax = 10
    roadTax
  }
}

object DemoClassObject {
  def main(args: Array[String]): Unit = {
    println("Hello abc")

    var bmw = new Car
    bmw.topClassExtraCost = 500

    println("Road tax is " + bmw.checkTax())

    var result = bmw.cost(10000)
    println("Total cost of car is " + result)
  }
}
