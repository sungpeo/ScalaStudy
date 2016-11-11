package ch11_objectsystem.linearization

object linearization4 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(108); 
  println("Welcome to the Scala worksheet")
  
  class C1{
    def m = print("C1 ")
  }
  trait T1 extends C1 {
    override def m = { print("T1 "); super.m }
  }
  trait T2 extends C1 {
    override def m = { print("T2 "); super.m }
  }
  trait T3 extends C1 {
    override def m = { print("T3 "); super.m }
  }
  class C2A extends T2 {
    override def m = { print("C2A "); super.m }
  }
  class C2 extends C2A with T1 with T2 with T3 {
    override def m = { print("C2 "); super.m }
  };$skip(571); 
  def calcLinearization(obj: C1, name: String) = {
    print(s"$name: ")
    obj.m
    print("AnyRef ")
    print("Any")
  };System.out.println("""calcLinearization: (obj: ch11_objectsystem.linearization.linearization4.C1, name: String)Unit""");$skip(38); 
  
  calcLinearization(new C2, "C2 ");$skip(14); 
  println("");$skip(38); 
  calcLinearization(new T3 {}, "T3 ");$skip(38); 
  calcLinearization(new T2 {}, "T2 ");$skip(38); 
  calcLinearization(new T1 {}, "T1 ");$skip(39); 
  calcLinearization(new C2A {}, "C2A");$skip(38); 
  calcLinearization(new C1 {}, "C1 ")}

}
