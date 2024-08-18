package org.okten.demo.dto;

import lombok.*;
import org.okten.demo.entity.ProductAvailability;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProductDto {

    private Long id;

    private String name;

    private BigDecimal price;

    private ProductAvailability availability;

    private String owner;
}
