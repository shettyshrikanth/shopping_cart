package com.shopping

import org.junit.runner.RunWith
import org.specs2.mutable.Specification
import org.specs2.runner.JUnitRunner

@RunWith(classOf[JUnitRunner])
class ShopTest extends Specification {

  "Shop which only sells apples and oranges " should {
    "Sell only Apples And Oranges" in {
      val size = Shop(Apple, Orange) filter { case item @ (Apple | Orange) => false; case _ => false } size

      size mustEqual 0
    }
  }
  
    "Apples cost 60p and Oranges cost 25p, therefore shop " should {
    "Sell Apple for 60p each " in {
      val appleList = Shop(Apple, Orange) filter { case item @ Apple => true; case _ => false }

      appleList(0).price mustEqual 0.60
    }

    "Sell Orange for 25p each " in {
      val orangeList = Shop(Apple, Orange) filter { case item @ Orange => true; case _ => false }

      orangeList(0).price mustEqual 0.25
    }
  }
    
    
  "Checkout system which takes a list of items scanned at the till and outputs the total cost" should {

    "3 Apples and 1 Orange cost Sterling 2.05  " in {
      Shop.checkout(ShoppingCart(Apple, Apple, Apple, Orange)) mustEqual 2.05
    }
    
    " Empty shopping cart cost 0.00 " in {
      Shop.checkout(ShoppingCart()) mustEqual 0.0       
    }
  }
}