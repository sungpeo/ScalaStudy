
class MyList[A] {
    def const[B >: A](x : B , tail : MyList[A]) = new MyList[B]
  
    def ::[B >: A] (x: B) : MyList[B] = const(x, this)
}
package covariant {
}
object test3 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(220); 

    val a1 : MyList[Cola] = new MyList;System.out.println("""a1  : MyList[<error>] = """ + $show(a1 ));$skip(28); 
    val a2 = new Cola :: a1;System.out.println("""a2  : <error> = """ + $show(a2 ));$skip(34); 
    val a3 = new TonicWater :: a2;System.out.println("""a3  : <error> = """ + $show(a3 ))}

}
