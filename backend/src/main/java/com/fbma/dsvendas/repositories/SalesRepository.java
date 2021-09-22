package com.fbma.dsvendas.repositories;

import java.util.List;

import com.fbma.dsvendas.model.Sale;
import com.fbma.dsvendas.model.dtos.SellerSuccessRateDTO;
import com.fbma.dsvendas.model.dtos.SellerSumDTO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface SalesRepository extends JpaRepository<Sale, Long> {

    @Query("SELECT new com.fbma.dsvendas.model.dtos.SellerSumDTO(s.seller, SUM(s.amount)) FROM Sale as s GROUP BY s.seller")
    List<SellerSumDTO> amountGroupedBySeller();

    @Query("SELECT new com.fbma.dsvendas.model.dtos.SellerSuccessRateDTO(s.seller, SUM(s.deals), SUM(s.visited)) FROM Sale as s GROUP BY s.seller")
    List<SellerSuccessRateDTO> successRateGroupedBySeller();
}
