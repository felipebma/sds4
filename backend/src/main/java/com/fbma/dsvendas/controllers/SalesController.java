package com.fbma.dsvendas.controllers;

import com.fbma.dsvendas.model.dtos.SaleDTO;
import com.fbma.dsvendas.services.SalesService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sales")
public class SalesController {

  @Autowired
  private SalesService service;

  @GetMapping()
  public ResponseEntity<Page<SaleDTO>> findAllPageable(Pageable pageable) {
    return ResponseEntity.ok(service.findAll(pageable));
  }
}