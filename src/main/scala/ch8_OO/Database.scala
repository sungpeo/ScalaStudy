package ch8_OO

object Database {
  case class ResultSet(/*...*/)
  case class Connection(/*...*/)
  
  case class DatabaseException(message:String, cause: Throwable) extends
    RuntimeException(message, cause)
  
  sealed trait Status
  case object Disconnected extends Status
  case class Connected(connection: Connection) extends Status
  case class QuerySucceeded(results: ResultSet) extends Status
  case class QueryFailed(e: DatabaseException) extends Status
}

class Database {
  import Database._
  
  def connect(server: String): Status = ???
  def disconnection(): Status = ???
  
  def query(/*...*/): Status = ???
}


