package com.example.springboot_bookstoreapplication.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class QuantityDTO {
    String token;
    int quantity;
}
