
object MatchTest{;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(55); 

  
  def getVal() : Int = { 100 };System.out.println("""getVal: ()Int""");$skip(370); 
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
  }}
}
