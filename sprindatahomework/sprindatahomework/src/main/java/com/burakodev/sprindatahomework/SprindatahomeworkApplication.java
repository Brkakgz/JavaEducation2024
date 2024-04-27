package com.burakodev.sprindatahomework;

import com.burakodev.sprindatahomework.model.Customers;
import com.burakodev.sprindatahomework.model.Orders;
import com.burakodev.sprindatahomework.model.Products;
import com.burakodev.sprindatahomework.repository.CustomersRepository;
import com.burakodev.sprindatahomework.repository.OrdersRepository;
import com.burakodev.sprindatahomework.repository.ProductsRepository;
import org.aspectj.weaver.ast.Or;
import org.hibernate.query.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class SprindatahomeworkApplication implements CommandLineRunner {
	@Autowired
	private CustomersRepository customersRepository;
	@Autowired
	private ProductsRepository productsRepository;
	@Autowired
	private OrdersRepository ordersRepository;
	public static void main(String[] args) {
		SpringApplication.run(SprindatahomeworkApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Customers customers = new Customers();
		customers.setCustomerName("mehmet");
		customers.setCustomerMail("mehmet@gmail.com");
		customers.setCustomerAdress("mamak");
		customersRepository.save(customers);

		Products products = new Products();
		products.setProductName("Java ile Programlamaya Giriş");
		products.setProductPrice(99);
		productsRepository.save(products);

		Orders orders = new Orders();
		orders.setCustomerId(customers.getCustomerId());
		orders.setProductId(products.getProductId());
		orders.setOrderDate(2020);
		ordersRepository.save(orders);



		findbyAllCustomerDetails();
		findbyAllOrderDetail();
		findProductById();
	}

	//Amaç metodlamak işte başka vasfı yok
	public void findbyAllCustomerDetails() {
		List<Customers> customersList = customersRepository.findbyAllCustomerDetails("mehmet", "mehmet@gmail.com","mamak",1002);
		customersList.forEach(System.out::println);
	}

	public void findbyAllOrderDetail()
	{
		List<Orders> orderList = ordersRepository.findAllOrderDetail( 502,902, 852,2020);
		orderList.forEach(System.out::println);

	}

	public List findProductById()
	{
		List<Products> productsList = productsRepository.findProductbyId(952);
		productsList.forEach(System.out::println);
		return productsList;
	}

}
