package com.book.ecommerce.controller;

import com.book.ecommerce.dto.CartDTO;
import com.book.ecommerce.model.Cart;
import com.book.ecommerce.service.CartService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/cart")
@RequiredArgsConstructor
public class CartController {

    private final CartService cartService;

    @GetMapping("/{userId}")
    public ResponseEntity<Cart> getCart(@PathVariable Long userId) {
        return ResponseEntity.ok(cartService.getCartByUserId(userId));
    }

    @PostMapping("/{userId}/add")
    public ResponseEntity<Cart> addToCart(@PathVariable Long userId,
                                          @RequestBody CartDTO dto) {
        return ResponseEntity.ok(cartService.addToCart(userId, dto));
    }
}