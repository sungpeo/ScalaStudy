package ch9_trait
// src/main/scala/progscala2/traits/ui2/vetoable-click-count-observer.sc
import ch9_trait.observer._
import ch9_trait.ui2.{Button, Clickable, ObservableClicks, VetoableClicks}
  
object test_vetoable_click_count_observer {

  println("test_vetoable_click_count_observer")   //> test_vetoable_click_count_observer
	// Button 내에서 'click'을 오버라이딩할 필요는 없다.
	
	val button = new Button("Click Me!") with VetoableClicks with ObservableClicks {
	                     override val maxAllowed = 2
	                }                         //> button  : ch9_trait.ui2.Button with ch9_trait.ui2.VetoableClicks with ch9_tr
                                                  //| ait.ui2.ObservableClicks = ch9_trait.test_vetoable_click_count_observer$$ano
                                                  //| nfun$main$1$$anon$1@3b6eb2ec
	
	class ClickCountObserver extends Observer[Clickable] {
	  var count = 0
	  def receiveUpdate(state: Clickable): Unit = count += 1
	}
	
	val bco1 = new ClickCountObserver         //> bco1  : ch9_trait.test_vetoable_click_count_observer.ClickCountObserver = ch
                                                  //| 9_trait.test_vetoable_click_count_observer$$anonfun$main$1$ClickCountObserve
                                                  //| r$1@1e643faf
	val bco2 = new ClickCountObserver         //> bco2  : ch9_trait.test_vetoable_click_count_observer.ClickCountObserver = ch
                                                  //| 9_trait.test_vetoable_click_count_observer$$anonfun$main$1$ClickCountObserve
                                                  //| r$1@6e8dacdf
	
	button addObserver bco1
	button addObserver bco2
	
	(1 to 5) foreach (_ => button.click())
	
	assert(bco1.count == 5, s"bco1.count ${bco1.count} != 2")
	
	assert(bco2.count == 2, s"bco2.count ${bco2.count} != 2")
                                                  //> java.lang.AssertionError: assertion failed: bco2.count 5 != 2
                                                  //| 	at scala.Predef$.assert(Predef.scala:170)
                                                  //| 	at ch9_trait.test_vetoable_click_count_observer$$anonfun$main$1.apply$mc
                                                  //| V$sp(ch9_trait.test_vetoable_click_count_observer.scala:30)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$$anonfun$$exe
                                                  //| cute$1.apply$mcV$sp(WorksheetSupport.scala:76)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$.redirected(W
                                                  //| orksheetSupport.scala:65)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$.$execute(Wor
                                                  //| ksheetSupport.scala:75)
                                                  //| 	at ch9_trait.test_vetoable_click_count_observer$.main(ch9_trait.test_vet
                                                  //| oable_click_count_observer.scala:6)
                                                  //| 	at ch9_trait.test_vetoable_click_count_observer.main(ch9_trait.test_veto
                                                  //| able_click_count_observer.scala)
	
	
	println("Success!")
/*

*/
}