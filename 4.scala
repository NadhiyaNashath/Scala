/* Suppose the cover price of a book is Rs. 24.95, but bookstores get 
a 40% discount. Shipping costs Rs. 3 for the first 50 copies and 75 
cents for each additional copy. What is the total wholesale cost for 60 
copies?*/  

object wholesaleCost 
{
    def main(args: Array[String]): Unit = {

    val coverPrice = 24.95       
    val discount = 0.40
    val shippingCostFirst50 = 3
    val shippingAdditional = 0.75

    val number = 60

    val discountPrice = coverPrice * (1 - discount)
    val totalCost = number * discountPrice

    val shippingCost =
        if (number <= 50) 
        {
            shippingCostFirst50.toDouble
        } 
        else 
        {
            shippingCostFirst50.toDouble + (number - 50) * shippingAdditional
        }
    //val ship = shippingCost.toDouble
    val totalWholesaleCost = totalCost + shippingCost

    println(s"The total wholesale cost : Rs. $totalWholesaleCost")
  }

}
