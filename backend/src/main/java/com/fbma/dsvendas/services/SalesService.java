package com.fbma.dsvendas.services;

import java.util.List;

import com.fbma.dsvendas.model.dtos.SaleDTO;
import com.fbma.dsvendas.model.dtos.SellerSumDTO;
import com.fbma.dsvendas.repositories.SalesRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class SalesService {

  @Autowired
  private SalesRepository repository;

  @Transactional(readOnly = true)
  public Page<SaleDTO> findAll(Pageable pageable) {
    return repository.findAll(pageable).map(sale -> new SaleDTO(sale));
  }

  public List<SellerSumDTO> amountGroupedBySeller() {
    return repository.amountGroupedBySeller();
  }
}
