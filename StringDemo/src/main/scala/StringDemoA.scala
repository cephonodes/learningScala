object StringDemoA {
  def main(args: Array[String]): Unit = {
    var greetings = "Hello World!"
    println(greetings)
    var greetingsNew:String = "Hello India!"
    println(greetingsNew)

    // 長さの取得
    var lengthOfString = greetings.length()
    println("Length of String greetings : " + greetings + " is " + lengthOfString)

    // 結合
    var var1 = "Hello "
    var var2 = "World"
    println(var1 + var2 + "!")
    println(var1.concat(var2))

    // 比較
    var varA = "Hello World!"
    var varB = "Hello Japan!"
    println(varA.equals(varB))  // 両者が同じ文字列かどうかを確認する。
    println(varA == varB)   // varAとvarBがnullでないことを確認してから、両者が同じ文字列かどうかを確認する。

    // 整形
    var nameOfCar = "Mercedes"
    var costOfCar = 500000
    var mileageOfCar = 8.5
    printf("Name of Car is %s and cost of Car is %d and mileage of Car is %f\n", nameOfCar, costOfCar, mileageOfCar)

    // 複数行に渡る文字列
    var multiLineStringA =  // これだと字下げの分の空白が入る
      """Hello
        World
        How
        are
        you
      """
    println(multiLineStringA)

    var multiLineStringB =  // これだと字下げの分の空白は入らない
      """Hello
        |World
        |How
        |are
        |you
        |""".stripMargin
    println(multiLineStringB)

    var multiLineStringC =
      """Hello
        $World
        $How
        $are
        $you
        $""".stripMargin('$')   // 任意の区切り文字を指定することもできる
    println(multiLineStringC)

    // 文字列の補間（String interpolation）
    var name = "Modi"
    println("Hello " + name + ", How are you?")
    println(s"Hello ${name}, How are you?")   // JavaScriptでいうテンプレートリテラルのようなことができる

    name = "PM Modi"
    var salary = 20000.2
    println(f"Name is $name%s and salary is $salary%8.2f and designation is PM")  // printfみたいに書ける

    println(s"Hello World!\nHow are you?")
    println(raw"Hello World!\nHow are you?")  // rawを付けると、\nは改行ではなく\nという文字列として扱われる。
  }
}
