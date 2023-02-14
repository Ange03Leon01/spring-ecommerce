package com.curso.ecommerce.springecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.curso.ecommerce.springecommerce.model.Orden;

@Repository
public interface IOrdenRepository extends JpaRepository<Orden, Integer> {

}