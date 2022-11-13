package site.shamota.stock.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import site.shamota.stock.entity.Stock;

@Repository
public interface StockRepository extends JpaRepository<Stock, Long> {
}
