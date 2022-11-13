package site.shamota.stock.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import site.shamota.stock.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

//    Product findProductByName(String name);
}
