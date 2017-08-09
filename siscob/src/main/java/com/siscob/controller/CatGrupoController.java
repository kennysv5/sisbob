package com.siscob.controller;

import org.springframework.web.bind.annotation.RequestMethod;
import com.siscob.service.CatGrupoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;
import org.springframework.web.bind.annotation.ResponseBody;
import com.siscob.model.CatGrupo;
import org.springframework.web.bind.annotation.PathVariable;
import com.siscob.model.CatGrupo;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.util.UriComponentsBuilder;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/catgrupo")
public class CatGrupoController{

    @Autowired
    @Qualifier("catGrupoServiceImpl")
    private CatGrupoService catGrupoService;

    @RequestMapping(method = RequestMethod.GET)
    public @ResponseBody List<CatGrupo> apiGet(){
        List<CatGrupo> catGrupos =catGrupoService.listAll();
        return catGrupos;
    }
   
    @RequestMapping(value = "/desnomvc/{desnomvc}", method = RequestMethod.GET)
    public @ResponseBody List<CatGrupo> buscarXDesNomVc(@PathVariable java.lang.String desnomvc){
        List<CatGrupo> catGrupos =catGrupoService.findByDesNomVc(desnomvc);
        return catGrupos;
    }
    @RequestMapping(value = "/flgestbo/{flgestbo}", method = RequestMethod.GET)
    public @ResponseBody List<CatGrupo> buscarXFlgEstBo(@PathVariable java.lang.Boolean flgestbo){
        List<CatGrupo> catGrupos =catGrupoService.findByFlgEstBo(flgestbo);
        return catGrupos;
    }
    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<?> post(@RequestBody CatGrupo catGrupo, UriComponentsBuilder ucBuilder){
        catGrupoService.add(catGrupo);
        return null;
    }
}