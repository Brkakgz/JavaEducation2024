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
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Scanner;

@Service
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


//		Customers customers = new Customers();
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("Müşteri adı giriniz:");
//		String customerName= scanner.next();
//		customers.setCustomerName(customerName);
//		System.out.println("Müşteri mail giriniz:");
//		String customerMail=scanner.next();
//		customers.setCustomerMail(customerMail);
//		System.out.println("Müşteri adres giriniz:");
//		String customerAdress=scanner.next();
//		customers.setCustomerAdress(customerAdress);
//		customersRepository.save(customers);
//
//
//		Products products = new Products();
//		System.out.println("Ürün adı giriniz:");
//		String productName= scanner.next();
//		products.setProductName(productName);
//		System.out.println("Ürün fiyatı giriniz:");
//		int productPrice= scanner.nextInt();
//		products.setProductPrice(productPrice);
//		productsRepository.save(products);
//
//		Orders orders = new Orders();
//		orders.setCustomerId(customers.getCustomerId());
//		orders.setProductId(products.getProductId());
//		System.out.println("Satın alım tarihi giriniz:");
//		int orderDate= scanner.nextInt();
//		orders.setOrderDate(orderDate);
//		ordersRepository.save(orders);

		//customerAdd();
		//productAdd();
		//ordersAdd();

		//deleteCustomersById(1252);

		findOrderedCustomerLists();
		//findbyAllCustomerDetails();
		//findbyAllOrderDetail();
		//findProductById();



		//One to many Customer--->O
	}

//	public void customerAdd()
//	{
//		Customers customers = new Customers();
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("Müşteri adı giriniz:");
//		String customerName= scanner.next();
//		customers.setCustomerName(customerName);
//		System.out.println("Müşteri mail giriniz:");
//		String customerMail=scanner.next();
//		customers.setCustomerMail(customerMail);
//		System.out.println("Müşteri adres giriniz:");
//		String customerAdress=scanner.next();
//		customers.setCustomerAdress(customerAdress);
//		customersRepository.save(customers);
//
//	}
//
//	public void productAdd(){
//		Scanner scanner = new Scanner(System.in);
//		Products products = new Products();
//		System.out.println("Ürün adı giriniz:");
//		String productName= scanner.next();
//		products.setProductName(productName);
//		System.out.println("Ürün fiyatı giriniz:");
//		int productPrice= scanner.nextInt();
//		products.setProductPrice(productPrice);
//		productsRepository.save(products);
//	}
//
//	public void ordersAdd(){
//		Scanner scanner = new Scanner(System.in);
//		Customers customers = new Customers();
//		Products products = new Products();
//		Orders orders = new Orders();
//		orders.setCustomerId(customers.getCustomerId());
//		orders.setProductId(products.getProductId());
//		System.out.println("Satın alım tarihi giriniz:");
//		int orderDate= scanner.nextInt();
//		orders.setOrderDate(orderDate);
//		ordersRepository.save(orders);

//	}
	public void findbyAllCustomerDetails() {
		//Customers customers = new Customers();
		//List<Customers> customersList = customersRepository.findbyAllCustomerDetails(customers.getCustomerId());
		List<Customers> customersList = customersRepository.findbyAllCustomerDetails(1202);
		System.out.println("Bu sonuç customersID'sonucuna göre gelmiştir");
		customersList.forEach(System.out::println);
	}
//
	public void findbyAllOrderDetail()
	{
		//Customers customers = new Customers();
		//Products products = new Products();
		//Orders orders = new Orders();
		//List<Orders> orderList = ordersRepository.findAllOrderDetail(orders.getOrdersId(), customers.getCustomerId(), products.getProductId(), 2020);
		List<Orders> orderList = ordersRepository.findAllOrderDetail(502,902,852 ,2020);
		orderList.forEach(System.out::println);
//
	}
//
	public void findProductById()
	{
		List<Products> productsList = productsRepository.findProductbyId(952);
		System.out.println("Bu sonuç ProductID'ye göre gelmiştir...");
		productsList.forEach(System.out::println);
	}
//
	public void deleteCustomersById(int id) {

		System.out.println(id+" numarasına sahip müşteri silinmiştir");
		customersRepository.deleteById(id);
	}

	public void findOrderedCustomerLists(){
		List<Customers> joinnedList= ordersRepository.findOrderedCustomerList();
		joinnedList.forEach(System.out::println);
	}
}
