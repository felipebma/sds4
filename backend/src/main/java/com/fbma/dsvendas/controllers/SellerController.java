package com.fbma.dsvendas.controllers;

import java.util.List;

import com.fbma.dsvendas.model.dtos.SellerDTO;
import com.fbma.dsvendas.services.SellerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/seller")
public class SellerController {

  @Autowired
  private SellerService service;

  @GetMapping
  public List<SellerDTO> findAll() {
    return service.findAll();
  }

}