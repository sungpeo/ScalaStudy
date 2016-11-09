object MatchSeq {
  
  val nonEmptySeq = Seq(1, 2, 3, 4, 5)            //> nonEmptySeq  : Seq[Int] = List(1, 2, 3, 4, 5)
  val emptySeq = Seq.empty[Int]                   //> emptySeq  : Seq[Int] = List()
  val nonEmptyList = List(1, 2, 3, 4, 5)          //> nonEmptyList  : List[Int] = List(1, 2, 3, 4, 5)
  val emptyList = Nil                             //> emptyList  : scala.collection.immutable.Nil.type = List()
  val nonEmptyVector = Vector(1, 2, 3, 4, 5)      //> nonEmptyVector  : scala.collection.immutable.Vector[Int] = Vector(1, 2, 3, 4
                                                  //| , 5)
  val emptyVector = Vector.empty[Int]             //> emptyVector  : scala.collection.immutable.Vector[Int] = Vector()
  val nonEmptyMap = Map("one"->1, "two"->2, "three"->3)
                                                  //> nonEmptyMap  : scala.collection.immutable.Map[String,Int] = Map(one -> 1, tw
                                                  //| o -> 2, three -> 3)
  val emptyMap = Map.empty[String,Int]            //> emptyMap  : scala.collection.immutable.Map[String,Int] = Map()
  
  def seqToString[T](seq: Seq[T]): String = seq match {
    case head +: tail => s"$head +: " + seqToString(tail)
    case Nil => "Nil"
  }                                               //> seqToString: [T](seq: Seq[T])String
  
  for (seq <- Seq(
      nonEmptySeq, emptySeq, nonEmptyList, emptyList,
      nonEmptyVector, emptyVector, nonEmptyMap.toSeq, emptyMap.toSeq)
      //;i <- (1 to seq.length)
    ) {
      //printf("%d : ", i)
      println(seqToString(seq))                   //> 1 +: 2 +: 3 +: 4 +: 5 +: Nil
                                                  //| Nil
                                                  //| 1 +: 2 +: 3 +: 4 +: 5 +: Nil
                                                  //| Nil
                                                  //| 1 +: 2 +: 3 +: 4 +: 5 +: Nil
                                                  //| Nil
                                                  //| (one,1) +: (two,2) +: (three,3) +: Nil
                                                  //| Nil
  }

}