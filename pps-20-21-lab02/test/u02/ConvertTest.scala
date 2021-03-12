package u02
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import u02.Convert._


class ConvertTest {

  val x: Int  = 5

  @Test def Testparity(){
    assertEquals("odd", parity(x))
    assertEquals("odd", fparity(x))
  }



}
