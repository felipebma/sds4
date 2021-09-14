package com.fbma.dsvendas.repositories;

import com.fbma.dsvendas.model.Sale;

import org.springframework.data.repository.PagingAndSortingRepository;

public interface SalesRepository extends PagingAndSortingRepository<Sale, Long> {

}