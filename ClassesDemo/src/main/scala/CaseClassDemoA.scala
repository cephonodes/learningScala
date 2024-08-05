case class Car(name: String, model: String) {
  val carName: String = name
  val carModel: String = model

  def printDetails(): Unit = {
    println(s"Car Name is: ${carName} or ${name} and Car Model is: ${carModel}")
  }
}

object CaseClassDemoA {
  def main(args: Array[String]): Unit = {
    val bmw = Car("BMW", "550")
    bmw.printDetails()

    bmw match {case Car(a, b) => println(a, b)}

    val mercedes = bmw.copy(name = "mercedes")
    mercedes.printDetails()

    println(bmw == mercedes)
  }
}
