package com.shopping

import Offer._

object Shop {

  def checkout(shoppingCart: ShoppingCart, offers: (ShoppingCart => Discount)*): BigDecimal = {
    val totalDiscount = offers.foldLeft(BigDecimal(0.00))((discountAcc, offer) => discountAcc + offer(shoppingCart))

    shoppingCart.items.map(item => item.price).sum - totalDiscount
  }
  
  val getItems = Seq(Apple, Orange)

  case class ShoppingCart(items: Fruit*)
  
  trait Fruit {
    val price: BigDecimal
  }

  object Apple extends Fruit {
    val price = BigDecimal(0.60)
  }

  object Orange extends Fruit {
    val price = BigDecimal(0.25)
  }
  
  
}
