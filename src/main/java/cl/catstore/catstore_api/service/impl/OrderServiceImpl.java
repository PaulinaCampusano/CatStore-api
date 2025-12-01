package cl.catstore.catstore_api.service.impl;

import cl.catstore.catstore_api.entity.Order;
import cl.catstore.catstore_api.entity.User;
import cl.catstore.catstore_api.repository.OrderRepository;
import cl.catstore.catstore_api.service.OrderService;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class OrderServiceImpl implements OrderService {

    private final OrderRepository orderRepository;

    @Override
    @Transactional(readOnly = true)
    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Order getOrderById(Long id) {
        return orderRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Order not found with id: " + id));
    }

    @Override
    @Transactional(readOnly = true)
    public List<Order> getOrdersByCustomer(User customer) {
        return orderRepository.findByCustomer(customer);
    }
}