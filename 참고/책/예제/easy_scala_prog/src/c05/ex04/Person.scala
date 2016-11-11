package c05.ex04

import scala.beans.BeanProperty

class Person {
  @BeanProperty var name:String = _
}


/*
c:\scala_test>scalac Person.scala

c:\scala_test>javap Person
Compiled from "Person.scala"
public class Person {
  public java.lang.String name();
  public void name_$eq(java.lang.String);
  public void setName(java.lang.String);
  public java.lang.String getName();
  public Person();
}
*/

////////////////////////////////////////////////////
/*
class Person {
  var age = 0
}*/

/*
c:\scala_test>scalac Person.scala
c:\scala_test>javap -private Person
Compiled from "Person.scala"
public class Person {
  private int age;
  public int age();
  public void age_$eq(int);
  public Person();
}
*/

////////////////////////////////////////////////
/*
class Person {
 private var age = 0
}
*/

/*
c:\scala_test>scalac Person.scala

c:\scala_test>javap -private Person
Compiled from "Person.scala"
public class Person {
  private int age;
  private int age();
  private void age_$eq(int);
  public Person();
}
*/

////////////////////////////////////////////////
/*
class Person {
 val age = 0
}
*/
/*
c:\scala_test>scalac Person.scala
Person.scala:2: error: ';' expected but 'var' found.
 public var age = 0
        ^
one error found

c:\scala_test>scalac Person.scala
c:\scala_test>javap -private Person
Compiled from "Person.scala"
public class Person {
  private final int age;
  public int age();
  public Person();
}
*/

///////////////////////////////////////////
/*
class Person {
 //private[this] var age = 0
 private[this] val age = 0
}
*/
/*
c:\scala_test>scalac Person.scala
c:\scala_test>javap -private Person
Compiled from "Person.scala"
public class Person {
  private int age;
  public Person();
}

c:\scala_test>scalac Person.scala
c:\scala_test>javap -private Person
Compiled from "Person.scala"
public class Person {
  private final int age;
  public Person();
}
*/
