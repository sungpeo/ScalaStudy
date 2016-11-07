

object Upper {
  def main(args: Array[String]): Unit = {
    args.map(_.toUpperCase()).map(printf("%s ",_))
    println("\nUpper Program.")
  }
}