package com.fbma.dsvendas.model.dtos;

import java.io.Serializable;
import java.time.LocalDate;

import com.fbma.dsvendas.model.Sale;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class SaleDTO implements Serializable {
  private Long id;
  private Integer visited;
  private Integer deals;
  private Double amount;
  private LocalDate date;
  private SellerDTO seller;

  public SaleDTO(Sale sale) {
    this.id = sale.getId();
    this.visited = sale.getVisited();
    this.deals = sale.getDeals();
    this.amount = sale.getAmount();
    this.date = sale.getDate();
    this.seller = new SellerDTO(sale.getSeller());
  }
}