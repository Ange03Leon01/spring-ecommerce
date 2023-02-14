package com.curso.ecommerce.springecommerce.service;

import java.util.List;

import com.curso.ecommerce.springecommerce.model.Orden;
	
public interface IOrdenService {
	List<Orden> findAll();
	Orden Save(Orden orden);
}
