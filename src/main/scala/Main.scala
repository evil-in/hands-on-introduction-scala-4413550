@main def sayHello: Unit = sayHi("preethi")
  // println("Hello world")

def sayHi(name: String): Unit = {
  val listN = List(1,2,3,4)
  val things: List[String | Int | Double] = List(1, "two", 3.0)
  println(s"Hi $name")
  println(s"List = $listN")
}