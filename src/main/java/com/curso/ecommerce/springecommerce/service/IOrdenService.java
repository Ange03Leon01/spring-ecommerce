package com.curso.ecommerce.springecommerce.service;

import java.util.List;

import com.curso.ecommerce.springecommerce.model.Orden;
import com.curso.ecommerce.springecommerce.model.Usuario;
	
public interface IOrdenService {
	List<Orden> findAll();
	Orden Save(Orden orden);
	String generarNumeroOrden();
	List<Orden> findByUsuario(Usuario usuario);
}
