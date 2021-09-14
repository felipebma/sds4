package com.fbma.dsvendas.model.dtos;

import java.io.Serializable;

import com.fbma.dsvendas.model.Seller;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class SellerDTO implements Serializable{

  Long id;
  String name;

  public SellerDTO(Seller seller){
    this.id = seller.getId();
    this.name = seller.getName();
  }

}