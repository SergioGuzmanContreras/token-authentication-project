package com.token.authentication.project.dao.entity;

import com.token.authentication.project.utils.enums.InventoryType;
import com.token.authentication.project.utils.enums.StatusEnum;
import com.token.authentication.project.utils.enums.UnitEnum;
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
@Table(name = "inventories")
public class Inventory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idInventory")
    private Long id;

    @Column(name = "idOrder", nullable = false)
    private Long order;

    @Column(name = "operation", nullable = false)
    private InventoryType operation;

    @Column(name = "parts", nullable = false)
    private Integer parts;

    @Column(name = "unit", nullable = false)
    private UnitEnum type;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idUser", referencedColumnName = "idUser", nullable = false, foreignKey = @ForeignKey(name = "fk_inventory_user"))
    private User user;

    @Column(name = "registrationDate", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date registrationDate;

    @Column(name = "status", nullable = false)
    private StatusEnum status;

}
