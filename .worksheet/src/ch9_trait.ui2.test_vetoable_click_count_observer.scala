// src/main/scala/progscala2/traits/ui2/vetoable-click-count-observer.sc
package ch9_trait.ui2

import ch9_trait.ui.Button
/*
import ch9_trait.observer._
*/
object test_vetoable_click_count_observer {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(248); 
  println("test_vetoable_click_count_observer")}
	//import ch9_trait.ui2._
  
// Button 내에서 'click'을 오버라이딩할 필요는 없다.
//val button =new Button("Click Me!") with ObservableClicks with VetoableClicks {
/*
val button =new Button("Click Me!") with VetoableClicks with ObservableClicks {
                     override val maxAllowed = 2
                }

class ClickCountObserver extends Observer[Clickable] {
  var count = 0
  def receiveUpdate(state: Clickable): Unit = count += 1
}

val bco1 = new ClickCountObserver
val bco2 = new ClickCountObserver

button addObserver bco1
button addObserver bco2

(1 to 5) foreach (_ => button.click())

assert(bco1.count == 5, s"bco1.count ${bco1.count} != 2")

assert(bco2.count == 2, s"bco2.count ${bco2.count} != 2")


println("Success!")

*/
}
