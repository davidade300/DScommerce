package com.Practicing.dscommerce.sevices;

import com.Practicing.dscommerce.dto.ProductDTO;
import com.Practicing.dscommerce.entities.Product;
import com.Practicing.dscommerce.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    @Transactional(readOnly = true)
    public ProductDTO findById(Long id) {
       Product product = repository.findById(id).get();
       return new ProductDTO(product);
    }

}