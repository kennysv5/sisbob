package com.siscob.service.impl;

import com.siscob.service.CatGrupoService;
import com.siscob.repository.CatGrupoJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import java.util.List;
import com.siscob.model.CatGrupo;

import org.springframework.stereotype.Service;

@Service("catGrupoServiceImpl")
public class CatGrupoServiceImpl implements CatGrupoService{

    @Autowired
    @Qualifier("catGrupoJpaRepository")
    private CatGrupoJpaRepository catGrupoJpaRepository;

    @Override
    public List<CatGrupo> listAll(){
        return catGrupoJpaRepository.findAll();
    }
    @Override
    public CatGrupo add(CatGrupo catGrupo){
        return catGrupoJpaRepository.save(catGrupo);
    }
    @Override
    public int remove(int id){
        catGrupoJpaRepository.delete(id);
        return 0;
    }
    @Override
    public CatGrupo update(CatGrupo catGrupo){
        return catGrupoJpaRepository.save(catGrupo);
    }
   
    @Override
    public List<CatGrupo> findByDesNomVc(java.lang.String desNomVc){
        return catGrupoJpaRepository.findByDesNomVc(desNomVc);
    }
    @Override
    public List<CatGrupo> findByFlgEstBo(java.lang.Boolean flgEstBo){
        return catGrupoJpaRepository.findByFlgEstBo(flgEstBo);
    }
}