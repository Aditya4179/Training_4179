package com.springboot.MyNewSpringBoot.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.MyNewSpringBoot.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}
