package com.fbma.dsvendas.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "tb_sellers")
@NoArgsConstructor
@Getter
public class Seller implements Serializable {
  @Setter
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  @Setter
  private String name;

  @JsonIgnore
  @OneToMany(mappedBy = "seller")
  private List<Sale> sales = new ArrayList<>();

  public Seller(Long id, String name) {
    this.id = id;
    this.name = name;
  }
}