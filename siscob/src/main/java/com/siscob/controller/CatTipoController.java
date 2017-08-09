package com.siscob.controller;

import org.springframework.web.bind.annotation.RequestMethod;
import com.siscob.service.CatTipoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;
import org.springframework.web.bind.annotation.ResponseBody;
import com.siscob.model.CatTipo;
import org.springframework.web.bind.annotation.PathVariable;
import com.siscob.model.CatTipo;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.util.UriComponentsBuilder;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/cattipo")
public class CatTipoController{

    @Autowired
    @Qualifier("catTipoServiceImpl")
    private CatTipoService catTipoService;

    @RequestMapping(method = RequestMethod.GET)
    public @ResponseBody List<CatTipo> apiGet(){
        List<CatTipo> catTipos =catTipoService.listAll();
        return catTipos;
    }
    @RequestMapping(value = "/idtipsi/{idtipsi}", method = RequestMethod.GET)
    public @ResponseBody List<CatTipo> buscarXIdTipSi(@PathVariable java.lang.Integer idtipsi){
        List<CatTipo> catTipos =catTipoService.findByIdTipSi(idtipsi);
        return catTipos;
    }
   
    @RequestMapping(value = "/desnomvc/{desnomvc}", method = RequestMethod.GET)
    public @ResponseBody List<CatTipo> buscarXDesNomVc(@PathVariable java.lang.String desnomvc){
        List<CatTipo> catTipos =catTipoService.findByDesNomVc(desnomvc);
        return catTipos;
    }
    @RequestMapping(value = "/simtipvc/{simtipvc}", method = RequestMethod.GET)
    public @ResponseBody List<CatTipo> buscarXSimTipVc(@PathVariable java.lang.String simtipvc){
        List<CatTipo> catTipos =catTipoService.findBySimTipVc(simtipvc);
        return catTipos;
    }
    @RequestMapping(value = "/flgestbo/{flgestbo}", method = RequestMethod.GET)
    public @ResponseBody List<CatTipo> buscarXFlgEstBo(@PathVariable java.lang.Boolean flgestbo){
        List<CatTipo> catTipos =catTipoService.findByFlgEstBo(flgestbo);
        return catTipos;
    }
    @RequestMapping(value = "/feccredt/{feccredt}", method = RequestMethod.GET)
    public @ResponseBody List<CatTipo> buscarXFecCreDt(@PathVariable java.sql.Timestamp feccredt){
        List<CatTipo> catTipos =catTipoService.findByFecCreDt(feccredt);
        return catTipos;
    }
    @RequestMapping(value = "/ipcrevc/{ipcrevc}", method = RequestMethod.GET)
    public @ResponseBody List<CatTipo> buscarXIpCreVc(@PathVariable java.lang.String ipcrevc){
        List<CatTipo> catTipos =catTipoService.findByIpCreVc(ipcrevc);
        return catTipos;
    }
    @RequestMapping(value = "/fecmoddt/{fecmoddt}", method = RequestMethod.GET)
    public @ResponseBody List<CatTipo> buscarXFecModDt(@PathVariable java.sql.Timestamp fecmoddt){
        List<CatTipo> catTipos =catTipoService.findByFecModDt(fecmoddt);
        return catTipos;
    }
    @RequestMapping(value = "/ipmodvc/{ipmodvc}", method = RequestMethod.GET)
    public @ResponseBody List<CatTipo> buscarXIpModVc(@PathVariable java.lang.String ipmodvc){
        List<CatTipo> catTipos =catTipoService.findByIpModVc(ipmodvc);
        return catTipos;
    }
    @RequestMapping(value = "/fecelidt/{fecelidt}", method = RequestMethod.GET)
    public @ResponseBody List<CatTipo> buscarXFecEliDt(@PathVariable java.sql.Timestamp fecelidt){
        List<CatTipo> catTipos =catTipoService.findByFecEliDt(fecelidt);
        return catTipos;
    }
    @RequestMapping(value = "/ipelivc/{ipelivc}", method = RequestMethod.GET)
    public @ResponseBody List<CatTipo> buscarXIpEliVc(@PathVariable java.lang.String ipelivc){
        List<CatTipo> catTipos =catTipoService.findByIpEliVc(ipelivc);
        return catTipos;
    }
    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<?> post(@RequestBody CatTipo catTipo, UriComponentsBuilder ucBuilder){
        catTipoService.add(catTipo);
        return null;
    }
}