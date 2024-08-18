package org.okten.demo.mapper;

import org.okten.demo.entity.Product;
import org.okten.demo.dto.ProductDto;
import org.okten.demo.dto.UpsertProductDto;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component

public class ProductMapper {

    public ProductDto matToDto(Product product) {
        return ProductDto.builder()
                        .id(product.getId())
                        .name(product.getName())
                        .price(BigDecimal.valueOf(product.getPrice()))
                        .availability(product.getAvailability())
                        .build();
    }

    public Product mapToEntity(UpsertProductDto dto) {
        Product product = new Product();
        product.setName(dto.getName());
        product.setPrice(dto.getPrice());
        product.setAvailability(product.getAvailability());
        return product;
    }

}
