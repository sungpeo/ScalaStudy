object traite_pre_init_val {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(61); 
  println("traite_pre_init_val")}
  
  trait AbstractT2 {
    println("In AbstractT2:")
    val value: Int
    val inverse = 1.0/value
    println("AbstractT2:value= "+value+", inverse= "+inverse)
  }
  
  
}
