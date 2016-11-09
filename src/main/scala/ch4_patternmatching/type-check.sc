object TypeCheck {

  def generalSize (x: Any) = x match {
    case s: String => s.length
    case m: Map[_,_] => m.size
    case _ => -1
  }                                               //> generalSize: (x: Any)Int
  generalSize("kook")                             //> res0: Int = 4
  generalSize(Map(1->"one",2->"two"))             //> res1: Int = 2
}