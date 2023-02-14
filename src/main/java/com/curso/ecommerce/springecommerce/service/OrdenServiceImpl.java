package com.curso.ecommerce.springecommerce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.curso.ecommerce.springecommerce.model.Orden;
import com.curso.ecommerce.springecommerce.repository.IOrdenRepository;

@Service
public class OrdenServiceImpl implements IOrdenService{

	@Autowired
	private IOrdenRepository ordenRepository;
	
	@Override
	public Orden Save(Orden orden) {
		return ordenRepository.save(orden);
	}

}
