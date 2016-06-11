package com.shopping

trait Fruit {
  val price : BigDecimal
  
}

object Apple extends Fruit {
   val price = BigDecimal(0.60)
}

object Orange extends Fruit {
  val price = BigDecimal(0.25)
}