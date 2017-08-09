package com.siscob.service;

import java.util.List;
import com.siscob.model.CatGrupo;
import javax.persistence.Entity;
import javax.persistence.Table;


public interface CatGrupoService{

    public abstract List<CatGrupo> listAll();

    public abstract CatGrupo add(CatGrupo catGrupo);

    public abstract int remove(int id);

    public abstract CatGrupo update(CatGrupo catGrupo);

    public abstract List<CatGrupo> findByDesNomVc(java.lang.String desNomVc);

    public abstract List<CatGrupo> findByFlgEstBo(java.lang.Boolean flgEstBo);

}