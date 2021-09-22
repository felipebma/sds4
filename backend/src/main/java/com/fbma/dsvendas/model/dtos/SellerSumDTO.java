package com.fbma.dsvendas.model.dtos;

import com.fbma.dsvendas.model.Seller;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class SellerSumDTO {

    private String name;
    private Double amountSum;

    public SellerSumDTO(Seller seller, Double amountSum) {
        this.name = seller.getName();
        this.amountSum = amountSum;
    }
}
