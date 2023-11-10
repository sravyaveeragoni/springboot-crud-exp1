package com.example.springbootcrudexp1.controller;

import com.example.springbootcrudexp1.entity.Product;
import com.example.springbootcrudexp1.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    private ProductService service;

    @PostMapping("/addProduct")
    public Product addProduct(@RequestBody Product product){
        return service.saveProduct(product);
    }
    @PostMapping("/addProducts")
    public List<Product> addProducts(@RequestBody List<Product> products){
        return service.saveProducts(products);
    }
    @GetMapping("/products")
    public List<Product> findAllProducts(){
        return service.getProducts();
    }
    @GetMapping("/productById/{id}")
    public Product getProductById(@PathVariable int id){
        return service.getProductById(id);
    }
    @GetMapping("/product/{name}")
    public Product findProductByName(@PathVariable String name){
        return service.getProductByName(name);
    }
    @DeleteMapping("/deleteProduct/{id}")
    public String deleteProduct(@PathVariable int id){
        return service.deleteProduct(id);}

    @PutMapping("/updateProduct")
    public Product updateProduct(@RequestBody Product product){
        return service.updateProduct(product);
    }





}
