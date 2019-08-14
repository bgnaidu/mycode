package com.naidu.springbootjpa.repository;

import org.springframework.data.repository.CrudRepository;

import com.naidu.springbootjpa.entities.Product;

public interface ProductRepo extends CrudRepository<Product, Long> {

}
