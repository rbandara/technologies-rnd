
object SortApp {
  def sort(numbers : Array[Int]) = {

  }

  def sum(a : Int, b : Int) : Int = a + b

  def curriedSum = (sum _).curried


  def capitalize(values : String*) = {
    values.map(x => x.toUpperCase())
  }

  def main(args : Array[String]) : Unit = {
    println(capitalize("hello", "scala"))
  }
}
