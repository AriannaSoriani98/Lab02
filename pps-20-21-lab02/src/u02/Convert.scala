package u02

object Convert {

  val i: Int = 0 //importante!! DEFINIRE INPUT
  //val f--> definisce una funzione di tipo lambda
  val fparity: Int => String = {
    case n if (n % 2 == 0) => "even"
    case _ => "odd"
  }

  def parity(x: Int): String = (x % 2) match { //def --> definisce una funzione di tipo metodo
    case 0 => "even"
    case _ => "odd"
  }


}
