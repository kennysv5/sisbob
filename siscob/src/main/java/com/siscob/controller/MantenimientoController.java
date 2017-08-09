package com.siscob.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/mantenimiento")
public class MantenimientoController {
	
	@GetMapping("/grupo/list")
	public String grupo() {
		return "grupo";
	}
	
	@GetMapping("/grupos/add")
	public String verFormGrupo() {
		return "addgrupo";
	}
	
	
}
