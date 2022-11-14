package site.shamota.stock.entity;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import site.shamota.stock.documents.Admission;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Table(schema = "stock")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
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
//
//    @ManyToOne
//    private Sale sale;
//
//    @ManyToOne
//    private Moving moving;
}
