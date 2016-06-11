package com.shopping

import math._

object Offer {
  type Discount = BigDecimal
  
  val buyOneGetOneFreeOnApple : ShoppingCart => Discount = shoppingCart => {
    val appleList = shoppingCart.items collect { case item @ Apple => item }
    
    floor(appleList.size/2) * 0.60    
  }
  
  val threeForThePriceOfTwoOnOrange : ShoppingCart => Discount = shoppingCart => {
    val orangeList = shoppingCart.items collect { case item @ Orange => item }
    
    floor(orangeList.size/3) * 0.25
  }
}
