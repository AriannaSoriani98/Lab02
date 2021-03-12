package u02

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

import u02.Composition._

class CompositionTest {

  @Test def composeTest(){
    val f: Int => Int = _-1
    val g: Int => Int = _*2

    assertEquals(9,compose(_-1,_*2)(5))
    assertEquals(9,composeGeneral(f,g)(5))
  }

}
