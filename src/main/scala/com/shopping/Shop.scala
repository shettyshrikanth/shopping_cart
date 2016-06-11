package com.shopping

object Shop {
  def apply(items: Fruit*): Seq[Fruit] = {
    items.toSeq    
  }
}