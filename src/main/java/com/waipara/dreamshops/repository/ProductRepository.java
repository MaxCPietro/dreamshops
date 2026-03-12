package com.waipara.dreamshops.repository;

import com.waipara.dreamshops.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product,Long> {

    public List<Product> findByCategoryName(String category);

}