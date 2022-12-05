package com.wecodee.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.wecodee.jpa.Entity.Customer;


public interface CustomerRepository extends JpaRepository<Customer, Integer>
{

	Object deleteProductByName(String name);
//	@Query("SELECT new com.wecodee.jpa.dto.OrderResponse (c.name,p.pName) FROM Customer c JOIN c.products.p")
//	public String getJoinMethod();

	Object save(String name);
	

}
