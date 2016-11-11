package ch9_trait
// src/main/scala/progscala2/traits/ui2/vetoable-click-count-observer.sc
import ch9_trait.observer._
import ch9_trait.ui2.{Button, Clickable, ObservableClicks, VetoableClicks}
  
object test_vetoable_click_count_observer {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(289); 

  println("test_vetoable_click_count_observer");$skip(192); 
	// Button 내에서 'click'을 오버라이딩할 필요는 없다.
	
	val button = new Button("Click Me!") with VetoableClicks with ObservableClicks {
	                     override val maxAllowed = 2
	                }
	
	class ClickCountObserver extends Observer[Clickable] {
	  var count = 0
	  def receiveUpdate(state: Clickable): Unit = count += 1
	};System.out.println("""button  : ch9_trait.ui2.Button with ch9_trait.ui2.VetoableClicks with ch9_trait.ui2.ObservableClicks = """ + $show(button ));$skip(173); 
	
	val bco1 = new ClickCountObserver;System.out.println("""bco1  : ch9_trait.test_vetoable_click_count_observer.ClickCountObserver = """ + $show(bco1 ));$skip(35); 
	val bco2 = new ClickCountObserver;System.out.println("""bco2  : ch9_trait.test_vetoable_click_count_observer.ClickCountObserver = """ + $show(bco2 ));$skip(27); 
	
	button addObserver bco1;$skip(25); 
	button addObserver bco2;$skip(42); 
	
	(1 to 5) foreach (_ => button.click());$skip(61); 
	
	assert(bco1.count == 5, s"bco1.count ${bco1.count} != 2");$skip(61); 
	
	assert(bco2.count == 2, s"bco2.count ${bco2.count} != 2");$skip(25); 
	
	
	println("Success!")}
/*

*/
}
