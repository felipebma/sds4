package com.fbma.dsvendas.services;

import com.fbma.dsvendas.model.dtos.SaleDTO;
import com.fbma.dsvendas.repositories.SalesRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@Service
public class SalesService {

  @Autowired
  private SalesRepository repository;

  public Page<SaleDTO> findAll(int page) {
    return repository.findAll(PageRequest.of(page, 5)).map(sale -> new SaleDTO(sale));
  }
}