package u02

object Fibonacci {

  //tail recursive function: when recursive call is the last thing executed by the function
  //questa funzione non p ricorsiva perchè l'ultima operazione eseguita è la somma
  def fib(n: Int): Int = n match {
    case 0 => 0
    case 1 => 1
    case _ => fib(n - 1) + fib(n - 2)
  }

}
