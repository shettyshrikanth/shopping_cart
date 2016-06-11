package com.shopping

import Offer._

case class ShoppingCart(items :Fruit*)

object Shop {
  
  def apply(items: Fruit*): Seq[Fruit] = {
    items.toSeq    
  }

  def checkout(shoppingCart: ShoppingCart, offers : (ShoppingCart => Discount) *) : BigDecimal = {
    val totalDiscount = offers.foldLeft(BigDecimal(0.00))((discountAcc, offer) => discountAcc + offer(shoppingCart)) 
    
    shoppingCart.items.map(item => item.price).sum - totalDiscount
  }
}
