package com.fbma.dsvendas.repositories;

import com.fbma.dsvendas.model.Sale;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SalesRepository extends JpaRepository<Sale, Long> {

}