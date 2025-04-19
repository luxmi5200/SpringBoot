/**
 * 
 */
package com.example.SpringBootApps;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.SpringBootApps.entity.Product;

@RestController
@RequestMapping("/api/v1")
public class ProductController {

    
    @GetMapping(path = "/hello")
    public String hello() {
    	return "Hello World";
    }
    
    @GetMapping(path="/product")
    public ResponseEntity<Product> getProduct() {
    	return ResponseEntity.ok(new Product(1l, "Mobile", 10.0, 5));
    }
}

