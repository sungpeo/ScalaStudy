// src/main/scala/progscala2/traits/ui2/Clickable.scala
package ch9_trait.ui2

trait Clickable {
  
  def click(): Unit = updateUI()                                    

  protected def updateUI(): Unit     
  
}
