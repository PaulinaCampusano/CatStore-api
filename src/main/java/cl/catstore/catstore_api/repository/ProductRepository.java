package cl.catstore.catstore_api.repository;

import cl.catstore.catstore_api.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
