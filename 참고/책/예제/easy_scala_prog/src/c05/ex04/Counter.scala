package c05.ex04

class Counter {
  private var value=0;
  def increament(){
    value +=1
  }
  
  def isLess(other: Counter)= value < other.value
  
/*  
  private[this] var value=0;
  def increament(){
    value +=1
  }
  
  def isLess(other: Counter)= value < other.value
  
  //¿¡·¯ : value value is not a member of c05.ex04.Counter
  */
}