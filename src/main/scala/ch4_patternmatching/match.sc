
object MatchTest{

  
  def getVal() : Int = { 100 }                    //> getVal: ()Int
  for {
    x <- Seq(1,2,2.7,"one","two",'four, 'five)
  }{
    
    val str = x match {
      case 1 => "int 1"
      case _: Int => "other int: "+x
      case _: Double => "a double: "+x
      case "one" => "string one"
      case _: String => "other string: "+x
      case scala.Symbol("four") => "Symbol four"
      case _ => Option.empty
    }
    println(str)
  }                                               //> int 1
                                                  //| other int: 2
                                                  //| a double: 2.7
                                                  //| string one
                                                  //| other string: two
                                                  //| Symbol four
                                                  //| None
}