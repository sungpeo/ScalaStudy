object MatchSuprise {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(220); 
  def checkY(y: Int) = {
    for {
      x <- Seq(99, 100, 101)
    } {
      val str = x match {
        case `y` => "found y!"
        case i: Int => "int: "+i
      }
      println(str)
    }
  };System.out.println("""checkY: (y: Int)Unit""");$skip(17); 
  
  checkY(100)}
}
