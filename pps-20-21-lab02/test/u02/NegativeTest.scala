package u02

import org.junit.jupiter.api.Assertions.{assertEquals, assertFalse, assertTrue}
import org.junit.jupiter.api.Test
import Negative._

class NegativeTest {

  @Test def femptyTest() {
    assertEquals(false, fempty("ciao"))
    assertFalse(fempty("ciao"))
    assertTrue(fempty(""))
  }

  @Test def nonEmptyTest(){
    assertFalse(nonEmpty(""))
    assertTrue(nonEmpty("ciao"))
  }

  @Test def emptyTest(): Unit ={
    assertEquals(false, empty("ciao"))
    assertFalse(empty("ciao"))
    assertTrue(empty(""))
  }

  @Test def nonEmptyMethodTest(){
    assertFalse(nonEmptyMethod(""))
    assertTrue(nonEmptyMethod("ciao"))
  }

  @Test def nonEmptyMethodWithGenericTest(): Unit ={
    assertTrue(nonEmptyMethodWithGeneric(10))
    assertTrue(nonEmptyMethodWithGeneric("ciao"))
    assertFalse(nonEmptyMethodWithGeneric(""))
  }

}
