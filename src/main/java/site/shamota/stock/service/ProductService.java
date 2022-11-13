package site.shamota.stock.service;

import org.springframework.stereotype.Service;
import site.shamota.stock.entity.Product;
import site.shamota.stock.repository.ProductRepository;

import java.util.List;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public Product getById(Long id) {
        return productRepository.findById(id).orElse(null);
    }

//    public Product findProductByName(String name) {
//        return productRepository.findProductByName(name);
//    }

    public List<Product> findAll() {
        return productRepository.findAll();
    }

    public void saveProduct(Product product) {
        productRepository.save(product);
    }

    public void deleteById(Long id) {
        productRepository.deleteById(id);
    }
}
