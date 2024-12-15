package com.venzee.dbthinking.entites;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "bank_type")
@Data
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class BankType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private BankTypeEnum type;

    @OneToMany(mappedBy = "bankType")
    private List<Payment> payments;

    @OneToMany(mappedBy = "bankType")
    private List<BankTypeAuth> bankTypeAuths;
}