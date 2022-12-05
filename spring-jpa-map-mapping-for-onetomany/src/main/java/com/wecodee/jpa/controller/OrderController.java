package com.wecodee.jpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wecodee.jpa.Entity.Customer;
import com.wecodee.jpa.dto.OrderRequest;
import com.wecodee.jpa.repository.CustomerRepository;
import com.wecodee.jpa.repository.ProductRepository;

@RestController
@RequestMapping("api")
public class OrderController {
	@Autowired
	private CustomerRepository customerRepository;

	@Autowired
	private ProductRepository productRepository;

	@PostMapping("/placeOrder")
	public Customer placeOrder(@RequestBody Customer customer) {
		return customerRepository.save(customer);
		
	}
	
	@GetMapping("/findAllProducts")
	public  List<Customer> findAllOrders()
	{
		return customerRepository.findAll();
	}
	@DeleteMapping("/deleteproduct/{id}")
	public Object deleteProduct(@PathVariable int id)
	{
		 customerRepository.deleteById(id);
		return customerRepository.findAll();
	}
	@PutMapping("/update")
	public Object updateProductName(@RequestBody Customer customer)
	{
		return customerRepository.save(customer);
	}
	

}
