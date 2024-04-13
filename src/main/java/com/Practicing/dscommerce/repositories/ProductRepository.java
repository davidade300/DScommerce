package com.Practicing.dscommerce.repositories;

import com.Practicing.dscommerce.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

// componente responsavel por operacoes no BD com produtos
public interface ProductRepository extends JpaRepository<Product, Long> {

}
