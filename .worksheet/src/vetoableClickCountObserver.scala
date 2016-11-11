// src/main/scala/progscala2/traits/ui2/vetoable-click-count-observer.sc

object VetoableClickCountObserver{
  import ch9_traits.ui2._
  import ch9_traits.observer._;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(215); 
	// Button 내에서 'click'을 오버라이딩할 필요는 없다.
	val a = 1;System.out.println("""a  : Int = """ + $show(a ));$skip(116); 
	val button = new Button("Click Me!") with ObservableClicks with VetoableClicks {
	  override val maxAllowed = 2
	};System.out.println("""button  : ch9_traits.ui2.Button with ch9_traits.ui2.ObservableClicks with ch9_traits.ui2.VetoableClicks = """ + $show(button ))}
	/*
	
	class ClickCountObserver extends Observer[Clickable] {
	  var count = 0
	  def receiveUpdate(state: Clickable): Unit = count += 1
	}
	
	val bco1 = new ClickCountObserver
	val bco2 = new ClickCountObserver
	
	button addObserver bco1
	button addObserver bco2
	
	(1 to 5) foreach (_ => button.click())
	
	assert(bco1.count == 2, s"bco1.count ${bco1.count} != 2")
	assert(bco2.count == 2, s"bco2.count ${bco2.count} != 2")
	println("Success!")
	*/
}
