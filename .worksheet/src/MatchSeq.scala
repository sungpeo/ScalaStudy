object MatchSeq {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(59); 
  
  val nonEmptySeq = Seq(1, 2, 3, 4, 5);System.out.println("""nonEmptySeq  : Seq[Int] = """ + $show(nonEmptySeq ));$skip(32); 
  val emptySeq = Seq.empty[Int];System.out.println("""emptySeq  : Seq[Int] = """ + $show(emptySeq ));$skip(41); 
  val nonEmptyList = List(1, 2, 3, 4, 5);System.out.println("""nonEmptyList  : List[Int] = """ + $show(nonEmptyList ));$skip(22); 
  val emptyList = Nil;System.out.println("""emptyList  : scala.collection.immutable.Nil.type = """ + $show(emptyList ));$skip(45); 
  val nonEmptyVector = Vector(1, 2, 3, 4, 5);System.out.println("""nonEmptyVector  : scala.collection.immutable.Vector[Int] = """ + $show(nonEmptyVector ));$skip(38); 
  val emptyVector = Vector.empty[Int];System.out.println("""emptyVector  : scala.collection.immutable.Vector[Int] = """ + $show(emptyVector ));$skip(56); 
  val nonEmptyMap = Map("one"->1, "two"->2, "three"->3);System.out.println("""nonEmptyMap  : scala.collection.immutable.Map[String,Int] = """ + $show(nonEmptyMap ));$skip(39); 
  val emptyMap = Map.empty[String,Int];System.out.println("""emptyMap  : scala.collection.immutable.Map[String,Int] = """ + $show(emptyMap ));$skip(143); 
  
  def seqToString[T](seq: Seq[T]): String = seq match {
    case head +: tail => s"$head +: " + seqToString(tail)
    case Nil => "Nil"
  };System.out.println("""seqToString: [T](seq: Seq[T])String""");$skip(245); 
  
  for (seq <- Seq(
      nonEmptySeq, emptySeq, nonEmptyList, emptyList,
      nonEmptyVector, emptyVector, nonEmptyMap.toSeq, emptyMap.toSeq)
      //;i <- (1 to seq.length)
    ) {
      //printf("%d : ", i)
      println(seqToString(seq))}
  }

}
