package com.curso.ecommerce.springecommerce.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.curso.ecommerce.springecommerce.model.Orden;
import com.curso.ecommerce.springecommerce.model.Producto;
import com.curso.ecommerce.springecommerce.service.IDetalleOrdenService;
import com.curso.ecommerce.springecommerce.service.IOrdenService;
import com.curso.ecommerce.springecommerce.service.IUsuarioService;
import com.curso.ecommerce.springecommerce.service.ProductoService;

@Controller
@RequestMapping("/administrador")
public class AdministradorController {
	
	@Autowired
	private ProductoService productoService;
	
	@Autowired
	private IUsuarioService usuarioService;
	
	@Autowired
	private IOrdenService ordenService;
	
	@Autowired
	private IDetalleOrdenService detalleOrdenService;
	
	private final Logger logg = LoggerFactory.getLogger(AdministradorController.class);
	
	@GetMapping("")
	public String home(Model model) {

		List<Producto> productos = productoService.findAll();
		model.addAttribute("productos", productos);
		return "administrador/home";
	}
	
	@GetMapping("/usuarios")
	public String usuarios(Model model) {
		model.addAttribute("usuarios", usuarioService.findAll());
		return "administrador/usuarios";
	}
	
	@GetMapping("/ordenes")
	public String ordenes(Model model) {
		List<Orden> ordenes = ordenService.findAll();
		model.addAttribute("ordenes", ordenes);
		return "administrador/ordenes";
	}
	
	@GetMapping("/detalleorden/{id}")
	public String detalleOrden(@PathVariable Integer id, Model model) {
		logg.info("id de la orden: {}", id);
		Orden orden = ordenService.findById(id).get();
		model.addAttribute("detallesordenes", orden.getDetalle());
		return "administrador/detalleorden";
	}
}
