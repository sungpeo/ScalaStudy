package ch6_fp

object hof2 {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  val numbers = List(1,2,3,4,5,6,7,8,9,10)        //> numbers  : List[Int] = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
  numbers.partition(_%2==0)                       //> res0: (List[Int], List[Int]) = (List(2, 4, 6, 8, 10),List(1, 3, 5, 7, 9))
  numbers.find((i:Int) => i>5)                    //> res1: Option[Int] = Some(6)
  
  numbers.drop(5)                                 //> res2: List[Int] = List(6, 7, 8, 9, 10)
  numbers.dropWhile(_%2 != 0)                     //> res3: List[Int] = List(2, 3, 4, 5, 6, 7, 8, 9, 10)
  
  numbers.foldLeft(0)((m:Int, n:Int)=>m+n)        //> res4: Int = 55
  
  (100 /: List(1,2,3,4,5))(_+_)                   //> res5: Int = 115
  
  numbers.foldLeft(0){ (m:Int, n:Int) => println("m: " + m + " n: " + n); m+n }
                                                  //> m: 0 n: 1
                                                  //| m: 1 n: 2
                                                  //| m: 3 n: 3
                                                  //| m: 6 n: 4
                                                  //| m: 10 n: 5
                                                  //| m: 15 n: 6
                                                  //| m: 21 n: 7
                                                  //| m: 28 n: 8
                                                  //| m: 36 n: 9
                                                  //| m: 45 n: 10
                                                  //| res6: Int = 55
  numbers.foldRight(0){ (m:Int, n:Int) => println("m: " + m + " n: " + n); m+n }
                                                  //> m: 10 n: 0
                                                  //| m: 9 n: 10
                                                  //| m: 8 n: 19
                                                  //| m: 7 n: 27
                                                  //| m: 6 n: 34
                                                  //| m: 5 n: 40
                                                  //| m: 4 n: 45
                                                  //| m: 3 n: 49
                                                  //| m: 2 n: 52
                                                  //| m: 1 n: 54
                                                  //| res7: Int = 55
  
  List(List(1,2), List(3,4)).flatten              //> res8: List[Int] = List(1, 2, 3, 4)
}