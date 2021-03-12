package u02

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import u02.Optionals.Option._

class OptionalsTest {
  @Test def filterTest(): Unit ={
    assertEquals(Some(5),filter(Some(5))(_ > 2))
    assertEquals(None(),filter(Some(5))(_ > 8))
  }

  @Test def mapTest(): Unit ={
    assertEquals(Some(true), map(Some(5))(_ > 2))
    assertEquals(Some(false),map(Some(5))(_ > 8))
    assertEquals(None(),map(None[Int])(_ > 2) )
  }

  @Test def map2Test(): Unit ={
    assertEquals((Some(5),Some(2)), map2(Some(5))(Some(2)))
    assertEquals((None(),None()), map2(Some(5))(None()))
    assertEquals((None(),None()), map2(None())(Some(2)))
  }

}
