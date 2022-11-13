package site.shamota.stock.service;

import org.springframework.stereotype.Service;
import site.shamota.stock.entity.Stock;
import site.shamota.stock.repository.StockRepository;

import java.util.List;

@Service
public class StockService {

    private final StockRepository stockRepository;

    public StockService(StockRepository stockRepository) {
        this.stockRepository = stockRepository;
    }

    public Stock getById(Long id) {
        return stockRepository.findById(id).orElse(null);
    }

    public List<Stock> findAll() {
        return stockRepository.findAll();
    }

    public void saveStock(Stock stock) {
        stockRepository.save(stock);
    }

    public void deleteById(Long id) {
        stockRepository.deleteById(id);
    }
}
