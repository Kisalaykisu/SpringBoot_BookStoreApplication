package com.example.springboot_bookstoreapplication.service;

import com.example.springboot_bookstoreapplication.dto.CartDTO;
import com.example.springboot_bookstoreapplication.model.Cart;

import java.util.List;

public interface ICartService {
    Cart addCartData(Long userId, CartDTO cartDTO);

    List<Cart> allCartList();

    Cart getCartDetailsByCartId(Long cartId);
    List<Cart> getCartDetailsByUserId(Long userId);

    String editCartByCartId(Long cartId, CartDTO cartDTO);

    String deleteCartByCartId(Long cartId);
}
