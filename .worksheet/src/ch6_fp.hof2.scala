package ch6_fp

object hof2 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(73); 
  println("Welcome to the Scala worksheet");$skip(43); 
  val numbers = List(1,2,3,4,5,6,7,8,9,10);System.out.println("""numbers  : List[Int] = """ + $show(numbers ));$skip(28); val res$0 = 
  numbers.partition(_%2==0);System.out.println("""res0: (List[Int], List[Int]) = """ + $show(res$0));$skip(31); val res$1 = 
  numbers.find((i:Int) => i>5);System.out.println("""res1: Option[Int] = """ + $show(res$1));$skip(21); val res$2 = 
  
  numbers.drop(5);System.out.println("""res2: List[Int] = """ + $show(res$2));$skip(30); val res$3 = 
  numbers.dropWhile(_%2 != 0);System.out.println("""res3: List[Int] = """ + $show(res$3));$skip(46); val res$4 = 
  
  numbers.foldLeft(0)((m:Int, n:Int)=>m+n);System.out.println("""res4: Int = """ + $show(res$4));$skip(35); val res$5 = 
  
  (100 /: List(1,2,3,4,5))(_+_);System.out.println("""res5: Int = """ + $show(res$5));$skip(84); val res$6 = 
  
  numbers.foldLeft(0){ (m:Int, n:Int) => println("m: " + m + " n: " + n); m+n };System.out.println("""res6: Int = """ + $show(res$6));$skip(81); val res$7 = 
  numbers.foldRight(0){ (m:Int, n:Int) => println("m: " + m + " n: " + n); m+n };System.out.println("""res7: Int = """ + $show(res$7));$skip(40); val res$8 = 
  
  List(List(1,2), List(3,4)).flatten;System.out.println("""res8: List[Int] = """ + $show(res$8));$skip(52); 
  
  val nestedNumbers = List(List(1,2), List(3,4));System.out.println("""nestedNumbers  : List[List[Int]] = """ + $show(nestedNumbers ));$skip(57); val res$9 = 
  nestedNumbers.map((x:List[Int]) => x.map(_*2)).flatten;System.out.println("""res9: List[Int] = """ + $show(res$9));$skip(36); val res$10 = 
  nestedNumbers.flatMap(_.map(_*2));System.out.println("""res10: List[Int] = """ + $show(res$10))}
  
  
  
}
