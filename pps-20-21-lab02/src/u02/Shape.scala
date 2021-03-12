package u02

import scala.math.pow

object Shape {

  trait Shape;

  case class Rectangle(lato_maggiore: Double, lato_minore: Double) extends Shape

  case class Circle(raggio: Double) extends Shape

  case class Square(lato: Double) extends Shape

  def area(shape: Shape): Double = shape match {
    case Rectangle(l_maggiore, l_minore) => l_maggiore * l_minore
    case Circle(r) => 3.14 * pow(r, 2)
    case Square(l) => pow(l, 2)
  }

  def perimeter(shape: Shape): Double = shape match {
    case Rectangle(l_maggiore, l_minore) => 2 * l_maggiore + 2 * l_minore
    case Circle(r) => 2 * 3.14 * r
    case Square(l) => 4 * l
  }


}
