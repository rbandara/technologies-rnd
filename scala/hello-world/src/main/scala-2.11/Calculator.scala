
class Calculator(b: String) {
  val brand = b

  def add(a: Int, b: Int): Int = a + b
}

object CalculatorTest {
  def main(args: Array[String]) = {
    val c = new Calculator("HP")
    println(c.add(5, 3));
    println(c.brand)
  }
}

class Calculator2 {

  var acc = 0

  // method increment
  def minc = {
    acc + 1
  }

  // function increment
  val finc = { () => acc += 1 }
}

abstract class Shape {
  def getArea(): Double
}

class Circle(r: Double) extends Shape {
  def getArea(): Double = {
    return r * r * 22 / 7;
  }
}

object ShapeTest {
  def main(args : Array[String]) = {
    val c = new Circle(10)
    println(c.getArea())
    val s = new Shape {
      override def getArea(): Double = {
        return 0;
      }
    }
    println(s.getArea())


  }

  def allCaps(list : String*) = {}
}
