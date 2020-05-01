package org.cap.controller;

import org.cap.entities.Product;
import org.cap.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import  java.util.*;

import javax.annotation.PostConstruct;

@RestController
@RequestMapping("/products")
public class ProductRestController {

    @Autowired
    private IProductService service;
    
    @PostConstruct
    public void addProducts() {
    	Product product1 = new Product();
    	product1.setProductId("A");
    	product1.setProductName("Mobile");
    	product1.setProductPrice(2222);
    	product1.setCount(10);
    	service.add(product1);
    	
    	Product product2 = new Product();
    	product2.setProductId("B");
    	product2.setProductName("Laptop");
    	product2.setProductPrice(35000);
    	product2.setCount(5	);
    	service.add(product2);
    }
    

    @GetMapping
    public ResponseEntity<List<Product>>fetchAll(){
      List<Product>products =service.fetchAll();
      ResponseEntity<List<Product>>response=new ResponseEntity<>(products, HttpStatus.OK);
      return response;
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<Product>findProductById(@PathVariable("id") String id){
       Product product= service.findById(id);
       ResponseEntity<Product>response=new ResponseEntity<>(product,HttpStatus.OK);
       return response;
    }



}
