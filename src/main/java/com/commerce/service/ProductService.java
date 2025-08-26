package com.commerce.service;

import com.commerce.dto.ProductDTO;
import com.commerce.mapper.ProductMapper;
import com.commerce.model.Product;
import com.commerce.repository.ProductRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.apache.naming.EjbRef;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@Service
@RequiredArgsConstructor
public class ProductService {
    private final ProductRepository productRepository;
    private final ProductMapper productMapper;

    private static final String UPLOAD_DIR = "src/main/resource/static/images";

    @Transactional
    public ProductDTO createProduct(ProductDTO productDTO, MultipartFile image) throws IOException {
        Product product = productMapper.toEntity(productDTO);
        if(image!=null && !image.isEmpty()){
            String fileName = saveImage(image);
            product.setImage("/images/"+fileName);
        }
        Product savedProduct = productRepository.save(product);
    }
}
