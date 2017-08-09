package com.siscob.repository;

import java.util.List;
import com.siscob.model.CatGrupo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.siscob.model.CatGrupo;
import java.io.Serializable;
import org.springframework.stereotype.Repository;

@Repository("catGrupoJpaRepository")
public interface CatGrupoJpaRepository extends JpaRepository<CatGrupo, Serializable>{

    public abstract List<CatGrupo> findByIdGruInt(java.lang.Integer idGruIn);

    public abstract List<CatGrupo> findByDesNomVc(java.lang.String desNomVc);

    public abstract List<CatGrupo> findByFlgEstBo(java.lang.Boolean flgEstBo);

}