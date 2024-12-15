package com.venzee.dbthinking.repository;

import com.venzee.dbthinking.entites.BankType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BankTypeRepository extends JpaRepository<BankType,Integer> {
}
