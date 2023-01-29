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
@Table(name = "categories", uniqueConstraints = @UniqueConstraint(columnNames = {"name"}))
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idCategory")
    private Integer id;

    @Column(name = "name", length = 50, nullable = false)
    private String category;

    @Column(name = "description", length = 2000, nullable = true)
    private String description;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idUser", referencedColumnName = "idUser", nullable = false, foreignKey = @ForeignKey(name = "fk_category_user"))
    private User user;

    @Column(name = "registrationDate", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date registrationDate;

    @Column(name = "status", nullable = false)
    private StatusEnum status;

}
