package com.testshopjava.testshopjava.dto;


import com.testshopjava.testshopjava.entities.Address;
import com.testshopjava.testshopjava.entities.Customer;
import com.testshopjava.testshopjava.entities.Order;
import com.testshopjava.testshopjava.entities.OrderItem;
import java.util.Set;
import lombok.Data;



@Data
public class Purchase {

    private Customer customer;
    private Address shippingAddress;
    private Address billingAddress;
    private Order order;
    private Set<OrderItem> orderItems;

}
