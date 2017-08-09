package com.siscob.repository;

import java.util.List;
import com.siscob.model.CatTipo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.siscob.model.CatTipo;
import java.io.Serializable;
import org.springframework.stereotype.Repository;

@Repository("catTipoJpaRepository")
public interface CatTipoJpaRepository extends JpaRepository<CatTipo, Serializable>{

    public abstract List<CatTipo> findByIdTipSi(java.lang.Integer idTipSi);


    public abstract List<CatTipo> findByDesNomVc(java.lang.String desNomVc);

    public abstract List<CatTipo> findBySimTipVc(java.lang.String simTipVc);

    public abstract List<CatTipo> findByFlgEstBo(java.lang.Boolean flgEstBo);

    public abstract List<CatTipo> findByFecCreDt(java.sql.Timestamp fecCreDt);

    public abstract List<CatTipo> findByIpCreVc(java.lang.String ipCreVc);

    public abstract List<CatTipo> findByFecModDt(java.sql.Timestamp fecModDt);

    public abstract List<CatTipo> findByIpModVc(java.lang.String ipModVc);

    public abstract List<CatTipo> findByFecEliDt(java.sql.Timestamp fecEliDt);

    public abstract List<CatTipo> findByIpEliVc(java.lang.String ipEliVc);

}