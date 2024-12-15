package com.venzee.dbthinking.entites;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "bank")
@Data
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class Bank {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "bankName", nullable = false, length = 100)
    private String bankName;

    @OneToMany(mappedBy = "bank")
    private List<Payment> payments;

    @OneToMany(mappedBy = "bank")
    private List<RegionAndBank> regionAndBanks;
}