package com.shopping

import org.junit.runner.RunWith
import org.specs2.mutable.Specification
import org.specs2.runner.JUnitRunner
import Offer._

@RunWith(classOf[JUnitRunner])
class ShopWithOffersTest extends Specification {
  "When shop introduced two new offers " should {
    "Then 3 Apples should cost Sterling 1.20 with offer buy one and get one free" in {
      Shop.checkout(ShoppingCart(Apple, Apple,Apple), buyOneGetOneFreeOnApple) mustEqual 1.20
    }    
  }
}