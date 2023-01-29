package com.token.authentication.project.dao.entity;


import com.token.authentication.project.utils.enums.StatusEnum;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "products", uniqueConstraints = @UniqueConstraint(columnNames = {"code", "name"}))
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idProduct")
    private Long id;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idCategory", referencedColumnName = "idCategory", nullable = false, foreignKey = @ForeignKey(name = "fk_product_category"))
    private Category category;

    @Column(name = "code", length = 15, nullable = false)
    private String code;

    @Column(name = "name", length = 100, nullable = false)
    private String product;

    @Column(name = "description", length = 2000, nullable = true)
    private String description;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idUser", referencedColumnName = "idUser", nullable = false, foreignKey = @ForeignKey(name = "fk_product_user"))
    private User user;

    @Column(name = "registrationDate", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date registrationDate;

    @Column(name = "status", nullable = false)
    private StatusEnum status;

}
