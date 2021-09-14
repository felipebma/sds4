package com.fbma.dsvendas.services;

import java.util.List;
import java.util.stream.Collectors;

import com.fbma.dsvendas.model.dtos.SellerDTO;
import com.fbma.dsvendas.repositories.SellerRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SellerService {

  @Autowired
  private SellerRepository repository;

  public List<SellerDTO> findAll() {
    return repository.findAll().stream().map(seller -> new SellerDTO(seller)).collect(Collectors.toList());
  }
}