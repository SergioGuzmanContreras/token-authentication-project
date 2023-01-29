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
@Table(name = "providers", uniqueConstraints = @UniqueConstraint(columnNames = {"name"}))
public class Vendor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idProvider")
    private Integer id;

    @Column(name = "name", length = 100, nullable = false)
    private String provider;

    @Column(name = "address", length = 255, nullable = false)
    private String address;

    @Column(name = "rfc", length = 13, nullable = true)
    private String rfc;

    @Column(name = "email", length = 100, nullable = true)
    private String email;

    @Column(name = "phone", length = 20, nullable = false)
    private String phone;

    @Column(name = "extension", length = 10, nullable = true)
    private String extension;

    @Column(name = "delivery", length = 10, nullable = false)
    private Long delivery;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idUser", referencedColumnName = "idUser", nullable = false, foreignKey = @ForeignKey(name = "fk_vendor_user"))
    private User user;

    @Column(name = "registrationDate", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date registrationDate;

    @Column(name = "status", nullable = false)
    private StatusEnum status;

}
