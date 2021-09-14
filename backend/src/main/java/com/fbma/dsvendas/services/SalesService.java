package com.fbma.dsvendas.services;

import com.fbma.dsvendas.model.dtos.SaleDTO;
import com.fbma.dsvendas.repositories.SalesRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class SalesService {

  @Autowired
  private SalesRepository repository;

  public Page<SaleDTO> findAll(Pageable pageable) {
    return repository.findAll(pageable).map(sale -> new SaleDTO(sale));
  }
}