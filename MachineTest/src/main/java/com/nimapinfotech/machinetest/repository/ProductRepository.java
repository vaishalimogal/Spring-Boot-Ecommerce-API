package com.nimapinfotech.machinetest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nimapinfotech.machinetest.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
