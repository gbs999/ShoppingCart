package com.shoppingcart

object MainApp {

  def main(args: Array[String]) {
    println("[ " + args.mkString(", ") + " ] => £" + ShoppingCart.checkoutWithOffers(args))
  }

}
