object TypeCheck {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(142); 

  def generalSize (x: Any) = x match {
    case s: String => s.length
    case m: Map[_,_] => m.size
    case _ => -1
  };System.out.println("""generalSize: (x: Any)Int""");$skip(22); val res$0 = 
  generalSize("kook");System.out.println("""res0: Int = """ + $show(res$0));$skip(38); val res$1 = 
  generalSize(Map(1->"one",2->"two"));System.out.println("""res1: Int = """ + $show(res$1))}
}
