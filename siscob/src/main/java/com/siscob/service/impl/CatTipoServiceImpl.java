package com.siscob.service.impl;

import com.siscob.service.CatTipoService;
import com.siscob.repository.CatTipoJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import java.util.List;
import com.siscob.model.CatTipo;

import org.springframework.stereotype.Service;

@Service("catTipoServiceImpl")
public class CatTipoServiceImpl implements CatTipoService{

    @Autowired
    @Qualifier("catTipoJpaRepository")
    private CatTipoJpaRepository catTipoJpaRepository;

    @Override
    public List<CatTipo> listAll(){
        return catTipoJpaRepository.findAll();
    }
    @Override
    public CatTipo add(CatTipo catTipo){
        return catTipoJpaRepository.save(catTipo);
    }
    @Override
    public int remove(int id){
        catTipoJpaRepository.delete(id);
        return 0;
    }
    @Override
    public CatTipo update(CatTipo catTipo){
        return catTipoJpaRepository.save(catTipo);
    }
    @Override
    public List<CatTipo> findByIdTipSi(java.lang.Integer idTipSi){
        return catTipoJpaRepository.findByIdTipSi(idTipSi);
    }
   
    @Override
    public List<CatTipo> findByDesNomVc(java.lang.String desNomVc){
        return catTipoJpaRepository.findByDesNomVc(desNomVc);
    }
    @Override
    public List<CatTipo> findBySimTipVc(java.lang.String simTipVc){
        return catTipoJpaRepository.findBySimTipVc(simTipVc);
    }
    @Override
    public List<CatTipo> findByFlgEstBo(java.lang.Boolean flgEstBo){
        return catTipoJpaRepository.findByFlgEstBo(flgEstBo);
    }
    @Override
    public List<CatTipo> findByFecCreDt(java.sql.Timestamp fecCreDt){
        return catTipoJpaRepository.findByFecCreDt(fecCreDt);
    }
    @Override
    public List<CatTipo> findByIpCreVc(java.lang.String ipCreVc){
        return catTipoJpaRepository.findByIpCreVc(ipCreVc);
    }
    @Override
    public List<CatTipo> findByFecModDt(java.sql.Timestamp fecModDt){
        return catTipoJpaRepository.findByFecModDt(fecModDt);
    }
    @Override
    public List<CatTipo> findByIpModVc(java.lang.String ipModVc){
        return catTipoJpaRepository.findByIpModVc(ipModVc);
    }
    @Override
    public List<CatTipo> findByFecEliDt(java.sql.Timestamp fecEliDt){
        return catTipoJpaRepository.findByFecEliDt(fecEliDt);
    }
    @Override
    public List<CatTipo> findByIpEliVc(java.lang.String ipEliVc){
        return catTipoJpaRepository.findByIpEliVc(ipEliVc);
    }
}