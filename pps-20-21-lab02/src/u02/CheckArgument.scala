package u02

object CheckArgument {
  /* Curryng is the technique of transforming a function
  *  that takes multiple argument into a function
  *  that takes a single argument */
  /*
  val x: Double = 0
  val y: Double = 0
  val z: Double = 0
  */

  //curried
  val p1: Double => (Double => (Double => Boolean)) = (x: Double) => ((y: Double) => ((z: Double) => ((x <= y) && (y <= z))))
  //non-curried
  val p2: (Double, Double, Double) => Boolean = (x: Double, y: Double, z: Double) => ((x <= y) && (y <= z))

  def p3(x: Double)(y: Double)(z: Double): Boolean = ((x <= y) && (y <= z))

  def p4(x: Double, y: Double, z: Double): Boolean = ((x <= y) && (y <= z))

}
