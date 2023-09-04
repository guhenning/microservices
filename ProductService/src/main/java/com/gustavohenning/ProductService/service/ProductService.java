package com.gustavohenning.ProductService.service;

import com.gustavohenning.ProductService.model.ProductRequest;
import com.gustavohenning.ProductService.model.ProductResponse;

public interface ProductService {
    long addProduct(ProductRequest productRequest);

    ProductResponse getProductById(long productId);

    void reduceQuantity(long productId, long quantity);
}
