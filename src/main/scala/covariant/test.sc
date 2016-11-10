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
	object test3 {
	
	    val a1 : MyList[Cola] = new MyList    //> a1  : covariant.MyList[covariant.Cola] = covariant.MyList@61e4705b
	    val a2 = new Cola :: a1               //> a2  : covariant.MyList[covariant.Cola] = covariant.MyList@3b6eb2ec
	    val a3 = new TonicWater :: a2         //> a3  : covariant.MyList[covariant.SoftDrink] = covariant.MyList@1e643faf
	
}
}