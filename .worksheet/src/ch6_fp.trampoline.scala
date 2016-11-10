package ch6_fp
import scala.util.control.TailCalls._

object trampoline {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(117); 
  println("Welcome to the Scala worksheet");$skip(112); 
  
  def isEven(xs: List[Int]): TailRec[Boolean] =
    if (xs.isEmpty) done(true) else tailcall(isOdd(xs.tail));System.out.println("""isEven: (xs: List[Int])util.control.TailCalls.TailRec[Boolean]""");$skip(113); 
  
  def isOdd(xs: List[Int]): TailRec[Boolean] =
    if (xs.isEmpty) done(false) else tailcall(isEven(xs.tail));System.out.println("""isOdd: (xs: List[Int])util.control.TailCalls.TailRec[Boolean]""");$skip(105); 
  for(i <- 1 to 5) {
    val even = isEven((1 to i).toList).result
    println(s"$i is even? $even")
  }}
}
