package cl.catstore.catstore_api.service;

import cl.catstore.catstore_api.entity.Order;
import cl.catstore.catstore_api.entity.User;

import java.util.List;

public interface OrderService {

    List<Order> getAllOrders();

    Order getOrderById(Long id);

    List<Order> getOrdersByCustomer(User customer);
}
