//package com.burakodev.sprindatahomework;
//import com.burakodev.sprindatahomework.repository.OrdersRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//@Service
//public class OrderService {
//    private final OrdersRepository orderRepository;
//
//    @Autowired
//    public OrderService(OrdersRepository orderRepository) {
//        this.orderRepository = orderRepository;
//    }
//
//    public void printOrderDetails() {
//        List<Object[]> results = orderRepository.findOrderDetails();
//
//        for (Object[] row : results) {
//            // Verileri işleyin
//            String customerName = (String) row[0];
//            String productName = (String) row[1];
//            double productPrice = (double) row[2];
//            int orderDate = (int) row[3];
//
//            // İşleme kodu
//            System.out.println("Customer: " + customerName + ", Product: " + productName +
//                    ", Price: " + productPrice + ", Order Date: " + orderDate);
//        }
//    }
//}
