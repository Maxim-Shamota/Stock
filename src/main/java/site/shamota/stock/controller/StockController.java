package site.shamota.stock.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import site.shamota.stock.entity.Stock;
import site.shamota.stock.service.StockService;

import java.util.List;

@org.springframework.web.bind.annotation.RestController
@RequestMapping
public class StockController {

    StockService stockService;

    public StockController(StockService stockService) {
        this.stockService = stockService;
    }

    @GetMapping("/stock/all")
    public ResponseEntity<List<Stock>> showAllStocks() {
        List<Stock> stockList = stockService.findAll();
        return ResponseEntity.ok().body(stockList);
    }

    @PostMapping("/stock/save")
    public ResponseEntity<Stock> createStock(@RequestBody Stock stock) {
        stockService.saveStock(stock);
        return ResponseEntity.ok().body(stock);
    }

    @GetMapping("/stock/{id}")
    public ResponseEntity<Stock> showStockById(@PathVariable("id") long id) {
        Stock stock = stockService.getById(id);
        return ResponseEntity.status(HttpStatus.OK).body(stock);
    }

    @PutMapping("/stock/update/{id}")
    public ResponseEntity<Stock> updateStock(@PathVariable("id") long id, @RequestBody Stock oldStock) {
        Stock stock = stockService.getById(id);
        stock.setId(oldStock.getId());
        stock.setName(oldStock.getName());
        stock.setProducts(oldStock.getProducts());
        stockService.saveStock(stock);
        return ResponseEntity.ok().body(stock);
    }

    @DeleteMapping("/stock/delete/{id}")
    public ResponseEntity<Void> deleteStock(@PathVariable long id) {
        stockService.deleteById(id);
        return ResponseEntity.ok().build();
    }
}
