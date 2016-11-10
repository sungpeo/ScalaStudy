package ch6_fp

object hof1 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(42); val res$0 = 
  Set(1,1,2);System.out.println("""res0: scala.collection.immutable.Set[Int] = """ + $show(res$0));$skip(38); 
  
  val hostPort = ("localhost", 80);System.out.println("""hostPort  : (String, Int) = """ + $show(hostPort ));$skip(14); val res$1 = 
  hostPort._1;System.out.println("""res1: String = """ + $show(res$1));$skip(14); val res$2 = 
  hostPort._2;System.out.println("""res2: Int = """ + $show(res$2));$skip(15); val res$3 = 
  
  Map(1->2);System.out.println("""res3: scala.collection.immutable.Map[Int,Int] = """ + $show(res$3));$skip(22); val res$4 = 
  Map("foo" -> "bar");System.out.println("""res4: scala.collection.immutable.Map[String,String] = """ + $show(res$4));$skip(29); val res$5 = 
  Map(1-> Map("foo"->"bar"));System.out.println("""res5: scala.collection.immutable.Map[Int,scala.collection.immutable.Map[String,String]] = """ + $show(res$5));$skip(43); 
  
  val num = Map("one" -> 1, "two" -> 2);System.out.println("""num  : scala.collection.immutable.Map[String,Int] = """ + $show(num ));$skip(17); val res$6 = 
  num.get("two");System.out.println("""res6: Option[Int] = """ + $show(res$6));$skip(19); val res$7 = 
  num.get("three");System.out.println("""res7: Option[Int] = """ + $show(res$7));$skip(49); 
  
  
  val numbers = List(1,2,3,4,5,6,7,8,9,10);System.out.println("""numbers  : List[Int] = """ + $show(numbers ));$skip(31); val res$8 = 
  
  numbers.map((i:Int)=>i*2);System.out.println("""res8: List[Int] = """ + $show(res$8));$skip(35); 
  
  def timesTwo(i:Int):Int = i*2;System.out.println("""timesTwo: (i: Int)Int""");$skip(24); val res$9 = 
  numbers.map(timesTwo);System.out.println("""res9: List[Int] = """ + $show(res$9));$skip(34); 
  numbers.foreach((i:Int) => i*2);$skip(48); 
  val doubled = numbers.foreach((i:Int) => i*2);System.out.println("""doubled  : Unit = """ + $show(doubled ));$skip(37); val res$10 = 

  numbers.filter((i:Int) => i%2==0);System.out.println("""res10: List[Int] = """ + $show(res$10));$skip(37); val res$11 = 
  List(1,2,3).zip(List("a","b","c"));System.out.println("""res11: List[(Int, String)] = """ + $show(res$11))}
  
  
}
