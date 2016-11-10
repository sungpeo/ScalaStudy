package covariant {
	sealed trait Drink
	
	trait SoftDrink extends Drink
	class Cola extends SoftDrink
	class TonicWater extends SoftDrink
	
	trait Juice extends Drink
	class OrangeJuice extends Juice
	class AppleJuice extends Juice
	
	class MyList[A] {
	    def const[B >: A](x : B , tail : MyList[A]) = new MyList[B]
	    def ::[B >: A] (x: B) : MyList[B] = const(x, this)
	}
	object test3 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(435); 
	
	    val a1 : MyList[Cola] = new MyList;System.out.println("""a1  : covariant.MyList[covariant.Cola] = """ + $show(a1 ));$skip(29); 
	    val a2 = new Cola :: a1;System.out.println("""a2  : covariant.MyList[covariant.Cola] = """ + $show(a2 ));$skip(35); 
	    val a3 = new TonicWater :: a2;System.out.println("""a3  : covariant.MyList[covariant.SoftDrink] = """ + $show(a3 ))}
	
}
}
