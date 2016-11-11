// src/main/scala/progscala2/traits/ui2/ObservableClicks.scala
package ch9_trait.ui2
import ch9_trait.observer._

trait ObservableClicks extends Clickable with Subject[Clickable] {
  abstract override def click(): Unit = {     
    super.click()
    notifyObservers(this)
  }

}
