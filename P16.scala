class ContactInfo(val name: String, val email: String, val address: String)
class Customer(val contactInfo: ContactInfo)

object CustomerApp {
  def main(args: Array[String]): Unit = {
    val contact = new ContactInfo("Serafim Eline", "serafim@example.com", "11 Open Street") // Corrected the address
    val customer = new Customer(contact)

    println(s"Customer Name: ${customer.contactInfo.name}")
    println(s"Customer Email: ${customer.contactInfo.email}")
    println(s"Customer Address: ${customer.contactInfo.address}")
  }
}
