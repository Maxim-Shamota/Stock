package site.shamota.stock.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import site.shamota.stock.documents.Admission;
import site.shamota.stock.documents.Moving;
import site.shamota.stock.documents.Sale;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Table(schema = "stock")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String vendorCode;

    private Long lastPurchase;

    private Long lastSale;

    private Integer count;

    @ManyToOne
    private Stock stock;

    @ManyToOne
    private Admission admission;

    @ManyToOne
    private Sale sale;

    @ManyToOne
    private Moving moving;
}
