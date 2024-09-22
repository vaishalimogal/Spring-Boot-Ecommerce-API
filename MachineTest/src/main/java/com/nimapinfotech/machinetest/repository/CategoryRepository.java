package com.nimapinfotech.machinetest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nimapinfotech.machinetest.entity.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
