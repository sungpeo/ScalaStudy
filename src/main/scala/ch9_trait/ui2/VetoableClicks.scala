// src/main/scala/progscala2/traits/ui2/VetoableClicks.scala
package ch9_trait.ui2

import ch9_trait.ui2.Clickable

trait VetoableClicks extends Clickable {                            
  // 허용 가능한 최대 눌림 횟수의 기본값
  val maxAllowed = 1                                                 
  private var count = 0

  abstract override def click() = {
    if (count < maxAllowed) {                                       
      count += 1
      super.click()
    }
  }

}
