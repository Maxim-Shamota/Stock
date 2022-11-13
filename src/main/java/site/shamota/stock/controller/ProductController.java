package site.shamota.stock.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import site.shamota.stock.entity.Product;
import site.shamota.stock.service.ProductService;

import java.util.List;

@org.springframework.web.bind.annotation.RestController
@RequestMapping
public class ProductController {

    ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/product/all")
    public ResponseEntity<List<Product>> showAllProducts() {
        List<Product> productList = productService.findAll();
        return ResponseEntity.ok().body(productList);
    }

    @PostMapping("/product/save")
    public ResponseEntity<Product> createUser(@RequestBody Product product) {
        productService.saveProduct(product);
        return ResponseEntity.ok().body(product);
    }

    @GetMapping("/product/{id}")
    public ResponseEntity<Product> showProductById(@PathVariable("id") long id) {
        Product product = productService.getById(id);
        return ResponseEntity.status(HttpStatus.OK).body(product);
    }

//    @GetMapping("/product")
//    public ResponseEntity<Product> findProductByName(@RequestBody Product oldProduct) {
//        Product product = productService.findProductByName(oldProduct.getName());
//        return ResponseEntity.status(HttpStatus.OK).body(product);
//    }

    @PutMapping("/product/update/{id}")
    public ResponseEntity<Product> updateProduct(@PathVariable("id") long id, @RequestBody Product oldProduct) {
        Product product = productService.getById(id);
        product.setId(oldProduct.getId());
        product.setName(oldProduct.getName());
        product.setCount(oldProduct.getCount());
        product.setVendorCode(oldProduct.getVendorCode());
        product.setLastPurchase(oldProduct.getLastPurchase());
        product.setLastSale(oldProduct.getLastSale());
        product.setStock(oldProduct.getStock());
        productService.saveProduct(product);
        return ResponseEntity.ok().body(product);
    }

    @DeleteMapping("/product/delete/{id}")
    public ResponseEntity<Void> deleteProduct(@PathVariable long id) {
        productService.deleteById(id);
        return ResponseEntity.ok().build();
    }

}
