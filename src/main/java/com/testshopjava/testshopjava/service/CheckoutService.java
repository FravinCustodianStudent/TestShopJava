package com.testshopjava.testshopjava.service;


import com.testshopjava.testshopjava.dto.Purchase;
import com.testshopjava.testshopjava.dto.PurchaseResponse;

public interface CheckoutService {

    PurchaseResponse placeOrder(Purchase purchase);
}
