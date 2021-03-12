package u02

object Composition {


  def compose(f: Int => Int, g: Int => Int): (Int => Int) = x => f(g(x))

  //type A
  //vincoli =
  // 1) occorre definire localmente i tipi delle funzioni per consentire, ad esempio, di fare operazioni aritmetiche
  // 2) il tipo di otuput di g deve essere dello stesso tipo di Int
  def composeGeneral[A](f: A => A, g: A => A): A => A = x => f(g(x))

}
