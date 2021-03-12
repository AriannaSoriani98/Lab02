package u02

object Negative {

  //1= definizione con lambda
  //predicate on String
  //input= stringa --> ritorna true se è vuoto, false altrimenti
  //da String a Boolean
  val fempty = (s: String) => (s == "")

  //fneg è la forma negata di una funzione in input
  //??? = è il contrario di quello che farebbe f prendendo in ingresso s
  val fneg: (String => Boolean) => (String => Boolean) = f => (s => f(s) match {
    case true => false
    case false => true
  })

  //applicata:
  val nonEmpty = fneg(fempty)

  //2=definizione con metodo
  def empty(s: String): Boolean = (s == "")

  def neg(f: String => Boolean): String => Boolean = x => f(x) match {
    case true => false
    case false => true
  }

  def nonEmptyMethod: String => Boolean = neg(empty)

  def emptyGeneric[A](a: A): Boolean = (a == "")

  def negGeneric[A](f: A => A): A => Boolean = x => f(x) match {
    case true => false
    case false => true
  }

  def nonEmptyMethodWithGeneric[A]: A => Boolean = negGeneric(emptyGeneric)

}
