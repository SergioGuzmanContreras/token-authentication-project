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
@Table(name = "purchaseOrders")
public class PurchaseOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idPurchaseOrder")
    private Long id;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idProvider", referencedColumnName = "idProvider", nullable = false, foreignKey = @ForeignKey(name = "fk_purchase_order_vendor"))
    private Vendor vendor;

    @Column(name = "description", length = 2000, nullable = false)
    private String description;

    @Column(name = "deliveryDate", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date deliveryDate;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idUser", referencedColumnName = "idUser", nullable = false, foreignKey = @ForeignKey(name = "fk_purchase_order_user"))
    private User user;

    @Column(name = "registrationDate", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date registrationDate;

    @Column(name = "status", nullable = false)
    private StatusEnum status;

}
