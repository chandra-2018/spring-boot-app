package com.cpcode.ecommerce.entitiy;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.engine.internal.Cascade;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name="product_category")
// @Data -- known bug
@Getter
@Setter
public class ProductCategory {
    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

     @Column(name="category_name")
     private String categoryName;

     @OneToMany(cascade = CascadeType.ALL)
     private Set<Product> products;

}
