

import scala.annotation.tailrec
object Recursive {
  def main(args: Array[String]): Unit = {
    def factorial(i: Int) : Long = {
  	  @tailrec
  	  def fact(i: Int, accumulator: Int): Long = {
  	    if(i<=1) accumulator
  	    else fact(i-1, i*accumulator)
  	  }
  	  fact(i, 1)
  	}
  	(0 to 5) foreach ( i => println(factorial(i)) )
  	
  	@tailrec
  	def fibonacci(i: Int): Long = {
  	  if (i<=1) 1L
  	  else fibonacci(i-2) + fibonacci(i-1)
  	}
  	println(fibonacci(5))
  }
}