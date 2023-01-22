package com.testshopjava.testshopjava.dao;


import com.testshopjava.testshopjava.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
