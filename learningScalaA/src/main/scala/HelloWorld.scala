object HelloWorld {
  def main(args: Array[String]): Unit = {
    println("Hello World!!!")

//    var result = add(2, 5)
//    println("Addition of 2 and 5 is: " + result)

//    var result = addA(2, 5)
//    println("Addition of 2 and 5 is: " + result)

//    var result = addB(2, 5)
//    println("Addition of 2 and 5 is: " + result)

//    var result = addC(2, 5)
//    println("Addition of 2 and 5 is: " + result)

    var result = addD(2, 5)
    println("Addition of 2 and 5 is: " + result)
  }

  def add(x: Int, y: Int): Int = {
    var z = x + y
    return z
  }

  def addA(x: Int, y: Int): Int = {
    var z = x + y
    z  // returnは書かなくてもよい。
  }

  def addB(x: Int, y: Int) = {  // 戻り値の型は書かなくてもよい。
    var z = x + y
    z  // returnは書かなくてもよい。
  }

  def addC(x: Int, y: Int): Int = {  // returnを書くなら、戻り値の型を書かなければならない。
    var z = x + y
    return z  // Specifying the return keyword
  }

  def addD(x: Int, y:Int) = x + y   // 一行で書くなら括弧は不要。
}
