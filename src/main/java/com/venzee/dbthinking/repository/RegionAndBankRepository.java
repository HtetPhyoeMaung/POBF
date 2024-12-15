package com.venzee.dbthinking.repository;

import com.venzee.dbthinking.entites.RegionAndBank;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegionAndBankRepository extends JpaRepository<RegionAndBank, Integer> {
}
