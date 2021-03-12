import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test
import u02.CheckArgument._

class CheckArgumentTest {

  @Test def p1Test(): Unit ={
    assertTrue(p1(1)(2)(3))
  }
  @Test def p2Test(): Unit ={
    assertTrue(p2(1,2,3))
  }
  @Test def p3Test(): Unit ={
    assertTrue(p3(1)(2)(3))
  }
  @Test def p4Test(): Unit ={
    assertTrue(p4(1,2,3))
  }

}
