package com.curso.ecommerce.springecommerce.service;

import java.util.List;
import java.util.Optional;

import com.curso.ecommerce.springecommerce.model.Orden;
import com.curso.ecommerce.springecommerce.model.Usuario;
	
public interface IOrdenService {
	List<Orden> findAll();
	Optional<Orden> findById(Integer id);
	Orden Save(Orden orden);
	String generarNumeroOrden();
	List<Orden> findByUsuario(Usuario usuario);
}
