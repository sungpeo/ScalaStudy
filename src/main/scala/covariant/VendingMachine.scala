package covariant

sealed trait Drink

trait SoftDrink extends Drink
class Cola extends SoftDrink
class TonicWater extends SoftDrink

trait Juice extends Drink
class OrangeJuice extends Juice
class AppleJuice extends Juice

class VendingMachine[+A] {
  
}

object DrinkMain extends App {
  def install(softDrinkVM: VendingMachine[SoftDrink]): Unit = {
    println("Vending Machine ToString : " + softDrinkVM.toString)
  }
  
  //covariant subtyping
  install(new VendingMachine[Cola])
  install(new VendingMachine[TonicWater])
  
  //invariant
  install(new VendingMachine[SoftDrink])
  
  //error
//  install(new VendingMachine[Drink])
//  install(new VendingMachine[Juice])
//  install(new VendingMachine[OrangeJuice])
  
}