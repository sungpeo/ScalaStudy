package ch8_OO

case class Address(street: String, city: String, state: String, zip: String)

object Address {
  def apply(zip: String) = 
    new Address(
        "[unknown]", Address.zipToCity(zip), Address.zipToState(zip), zip)
  def zipToCity(zip: String) = "Anytown"
  def zipToState(zip: String) = "CA"
}