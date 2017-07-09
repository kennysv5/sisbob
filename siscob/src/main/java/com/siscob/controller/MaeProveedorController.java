package com.siscob.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.util.UriComponentsBuilder;

import com.siscob.model.MaeProveedor;
import com.siscob.service.MaeProveedorService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

@RestController
@RequestMapping("/proveedor")
public class MaeProveedorController{
	
	//private static final String ROL_VIEW = "proveedores";
	private static final Log LOG = LogFactory.getLog(MaeProveedorController.class);
	
	@Autowired
	@Qualifier("maeProveedorServiceImpl")
	private MaeProveedorService proveedorService;
	
	
	@RequestMapping(method=RequestMethod.GET)
    public @ResponseBody List<MaeProveedor> apiGet(@RequestParam(value="name", required=false, defaultValue="Stranger") String name) {
		System.out.println("hola");
		List<MaeProveedor> proveedores = proveedorService.listAllMaeProveedores(); 
		return proveedores;
    }	
	
	@RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<?> apiPost(@RequestBody MaeProveedor maeProveedor, UriComponentsBuilder ucBuilder) {
		
		MaeProveedor proveeNew = proveedorService.addMaeProveedor(maeProveedor);
		HttpHeaders headers = new HttpHeaders();
        /*headers.setLocation(ucBuilder.path("/api/droplet/{id}").buildAndExpand(dropletNew.getId()).toUri());*/	        
        return new ResponseEntity<String>(headers, HttpStatus.CREATED);
	    
    }

}
