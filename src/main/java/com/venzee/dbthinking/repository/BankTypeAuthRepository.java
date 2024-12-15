package com.venzee.dbthinking.repository;

import com.venzee.dbthinking.entites.BankTypeAuth;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BankTypeAuthRepository extends JpaRepository<BankTypeAuth, Integer> {
}
