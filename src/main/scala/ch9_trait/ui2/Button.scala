package ch9_trait.ui2

import ch9_trait.ui.Widget

class Button(val label: String) extends Widget with Clickable {
  protected def updateUI(): Unit = {}
}