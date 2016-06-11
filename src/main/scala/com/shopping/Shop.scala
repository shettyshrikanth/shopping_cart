package com.shopping

case class ShoppingCart(items :Fruit*)

object Shop {
  
  def apply(items: Fruit*): Seq[Fruit] = {
    items.toSeq    
  }

  def checkout(shoppingCart: ShoppingCart) : BigDecimal = {
    shoppingCart.items map (item => item.price) sum
  }
}