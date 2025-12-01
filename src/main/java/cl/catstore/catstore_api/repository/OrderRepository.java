package cl.catstore.catstore_api.repository;

import cl.catstore.catstore_api.entity.Order;
import cl.catstore.catstore_api.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderRepository extends JpaRepository<Order, Long> {

    // Para ver las órdenes de un cliente específico
    List<Order> findByCustomer(User customer);
}

