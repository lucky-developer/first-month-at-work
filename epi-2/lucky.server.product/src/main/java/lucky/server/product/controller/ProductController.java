package lucky.server.product.controller;

import entity.Product;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @GetMapping("/product/{productId}")
    public Product getProduct(@PathVariable("productId") int productId){
        return new Product(productId);
    }
}