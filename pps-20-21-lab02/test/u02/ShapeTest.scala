import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import u02.Shape._
class ShapeTest {

  var rettangolo = new Rectangle(10,8)
  var cerchio = new Circle(2)
  var quadrato = new Square(6)

  @Test def areaTest(): Unit ={
    assertEquals(80, area(rettangolo))
    assertEquals(3.14*2*2, area(cerchio))
    assertEquals(36, area(quadrato))
  }

  @Test def perimeterTest(): Unit ={
    assertEquals(36, perimeter(rettangolo))
    assertEquals(2*3.14*2, perimeter(cerchio))
    assertEquals(24, perimeter(quadrato))
  }
}
