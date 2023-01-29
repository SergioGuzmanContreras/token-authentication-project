package com.token.authentication.project.dao.entity;

import com.token.authentication.project.utils.enums.IvaEnum;
import com.token.authentication.project.utils.enums.StatusEnum;
import com.token.authentication.project.utils.enums.UnitEnum;
import jakarta.persistence.*;
import jakarta.validation.constraints.Digits;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "purchaseOrdersDetails")
public class PurchaseOrderDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idPurchaseOrderDetail")
    private Long id;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idPurchaseOrder", referencedColumnName = "idPurchaseOrder", nullable = false, foreignKey = @ForeignKey(name = "fk_purchase_detail_order"))
    private PurchaseOrder order;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idProduct", referencedColumnName = "idProduct", nullable = false, foreignKey = @ForeignKey(name = "fk_purchase_detail_product"))
    private Product product;

    @Column(name = "parts", nullable = false)
    private Long parts;

    @Column(name = "unit", nullable = false)
    private UnitEnum type;

    @Column(name = "iva", nullable = false)
    private IvaEnum iva;

    @Column(name = "price", nullable = false, precision = 9, scale = 2)
    @Digits(integer = 11, fraction = 2)
    private BigDecimal price;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idUser", referencedColumnName = "idUser", nullable = false, foreignKey = @ForeignKey(name = "fk_purchase_detail_user"))
    private User user;

    @Column(name = "registrationDate", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date registrationDate;

    @Column(name = "status", nullable = false)
    private StatusEnum status;

}
