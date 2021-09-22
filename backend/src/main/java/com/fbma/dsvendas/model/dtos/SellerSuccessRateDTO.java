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
public class SellerSuccessRateDTO {

    String sellerName;
    Long deals;
    Long visited;

    public SellerSuccessRateDTO(Seller seller, Long deals, Long visited) {
        this.sellerName = seller.getName();
        this.deals = deals;
        this.visited = visited;
    }

}
