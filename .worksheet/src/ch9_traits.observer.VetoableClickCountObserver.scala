// src/main/scala/progscala2/traits/ui2/vetoable-click-count-observer.sc
package ch9_traits.observer

import ch9_traits.ui2._
import ch9_traits.observer._

object VetoableClickCountObserver{;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(391); 
	// Button 내에서 'click'을 오버라이딩할 필요는 없다.
	val button =
	    new Button("Click Me!") with ObservableClicks with VetoableClicks {
	  override val maxAllowed = 2                                   // <1>
	}
	
	class ClickCountObserver extends Observer[Clickable] {          // <2>
	  var count = 0
	  def receiveUpdate(state: Clickable): Unit = count += 1
	};System.out.println("""button  : ch9_traits.ui2.Button with ch9_traits.ui2.ObservableClicks with ch9_traits.ui2.VetoableClicks = """ + $show(button ));$skip(189); 
	
	val bco1 = new ClickCountObserver;System.out.println("""bco1  : ch9_traits.observer.VetoableClickCountObserver.ClickCountObserver = """ + $show(bco1 ));$skip(35); 
	val bco2 = new ClickCountObserver;System.out.println("""bco2  : ch9_traits.observer.VetoableClickCountObserver.ClickCountObserver = """ + $show(bco2 ));$skip(27); 
	
	button addObserver bco1;$skip(25); 
	button addObserver bco2;$skip(42); 
	
	(1 to 5) foreach (_ => button.click());$skip(74); 
	
	assert(bco1.count == 2, s"bco1.count ${bco1.count} != 2");$skip(59);        // <3>
	assert(bco2.count == 2, s"bco2.count ${bco2.count} != 2");$skip(21); 
	println("Success!")}
}
