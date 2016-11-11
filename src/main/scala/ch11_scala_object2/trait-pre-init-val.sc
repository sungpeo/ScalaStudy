object traite_pre_init_val {
  println("traite_pre_init_val")                  //> traite_pre_init_val
  
  trait AbstractT2 {
    println("In AbstractT2:")
    val value: Int
    val inverse = 1.0/value
    println("AbstractT2:value= "+value+", inverse= "+inverse)
  }
  
  
}