package crm.customer.service;

import java.util.List;

import crm.customer.entity.Customer;


public interface CustomerService {
	public List<Customer> findAll();

	public Customer findById(int theId);

	public void save(Customer thecustomer);

	public void deleteById(int theId);



}