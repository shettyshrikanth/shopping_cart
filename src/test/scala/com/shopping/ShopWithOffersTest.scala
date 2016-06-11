package com.shopping

import org.junit.runner.RunWith
import org.specs2.mutable.Specification
import org.specs2.runner.JUnitRunner
import Offer._

@RunWith(classOf[JUnitRunner])
class ShopWithOffersTest extends Specification {
  "When shop introduced two new offers " should {
    "Then 3 Apples must cost Sterling 1.20 with the offer buy one and get one free" in {
      Shop.checkout(ShoppingCart(Apple, Apple, Apple), buyOneGetOneFreeOnApple) mustEqual 1.20
    }
  }

  "Then 7 Oranges must cost sterling 1.25 with the offer 3 for the price of 2" in {
    Shop.checkout(ShoppingCart(Orange, Orange, Orange, Orange, Orange, Orange, Orange), threeForThePriceOfTwoOnOrange) mustEqual 1.25
  }

  "Then 7 Oranges and 3 apples must cost sterling 2.45 with both offers" in {
    Shop.checkout(ShoppingCart(Orange, Orange, Orange, Orange, Orange, Orange, Apple, Orange, Apple, Apple), threeForThePriceOfTwoOnOrange, buyOneGetOneFreeOnApple) mustEqual 2.45
  }
}
