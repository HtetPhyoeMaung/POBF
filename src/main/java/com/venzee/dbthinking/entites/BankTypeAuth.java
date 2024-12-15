package com.venzee.dbthinking.entites;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "bank_type_auth")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BankTypeAuth {
    @Id
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @ManyToOne
    @JoinColumn(name = "bank_type_id", nullable = false)
    private BankType bankType;

    private Boolean hidden;
}
