package com.cpcode.ecommerce.entitiy;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name="product")
@Data
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    @ManyToOne
    @JoinColumn(name="category_id", nullable = false)
    private ProductCategory category;

    @Column(name="sku")
    private String sku;

    @Column(name="name")
    private String  name;

    @Column(name="description")
    private String discription;

    @Column(name="unit_price")
    private BigDecimal unitPrice;

    @Column(name="image_url")
    private String imageUrl;

    @Column(name="active")
    private Boolean  active;

    @Column(name="units_in_stock")
    private int  unitsInStocks;

    @CreationTimestamp
    @Column(name="date_created")
    private Date dateCreated;


    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="last_updated")
    private Date lastUpdated;


}
