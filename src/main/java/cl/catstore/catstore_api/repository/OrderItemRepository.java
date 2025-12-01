package cl.catstore.catstore_api.repository;

import cl.catstore.catstore_api.entity.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
