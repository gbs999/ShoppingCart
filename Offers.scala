package com.shoppingcart

object Offers {

  def buyOneGetOneApples(numberOfItems: Int, costOfOne: Double): Double = ((numberOfItems / 2) + (numberOfItems % 2)) * costOfOne

  def threeForTwoOranges(numberOfItems: Int, costOfOne: Double): Double = (2 * (numberOfItems/3) + (numberOfItems %3)) * costOfOne

  def offer(item: String): Int => Double = {
    val price: Double = ShoppingCart.getPrice(item)
    item toLowerCase() match {
      case "apple" => (numberOfItems:Int) => buyOneGetOneApples(numberOfItems, price)
      case "orange" => (numberOfItems:Int) => threeForTwoOranges(numberOfItems, price)
      case _ => (numberOfItems:Int) => numberOfItems * price
    }
  }

}
