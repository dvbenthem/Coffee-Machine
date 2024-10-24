// You can experiment here, it won’t be checked

fun main(args: Array<String>) {
  // put your code here

      val smartOne = Smartphone("Ericsong")
      smartOne.price = 9

      val smartTwo = Smartphone("iNokhe")
      print(smartTwo.price - smartOne.price)


}
    class Smartphone(val name: String) {
        var price: Int = -5
            get() = name.length - field
    }
