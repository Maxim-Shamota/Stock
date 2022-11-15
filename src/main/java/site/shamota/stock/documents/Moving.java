//package site.shamota.stock.documents;
//
//import lombok.AllArgsConstructor;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.Setter;
//import site.shamota.stock.entity.Product;
//import site.shamota.stock.entity.Stock;
//
//import javax.persistence.*;
//import java.util.Set;
//
//@Entity
//@NoArgsConstructor
//@AllArgsConstructor
//@Setter
//@Getter
//@Table(schema = "stock")
//public class Moving {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//
//    @ManyToOne
//    private Stock stockIn;
//
//    @ManyToOne
//    private Stock stockOut;
//
//    @OneToMany
//    private Set<Product> products;
//
//}
