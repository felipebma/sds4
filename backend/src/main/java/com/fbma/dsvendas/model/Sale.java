package com.fbma.dsvendas.model;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "tb_sales")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Sale implements Serializable {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private Integer visited;
  private Integer deals;
  private Double amount;
  private LocalDate date;
  @ManyToOne
  @JoinColumn(name = "seller_id")
  private Seller seller;
}
