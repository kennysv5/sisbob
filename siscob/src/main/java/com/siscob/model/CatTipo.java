package com.siscob.model;

import java.io.Serializable;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "CAT_TIPO")
public class CatTipo implements Serializable{

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)    
    @Column(name = "ID_TIP_SI")
    private java.lang.Integer idTipSi;
    
    @Column(name = "ID_GRU_IN")
    private java.lang.Integer idGruIn;
    @Column(name = "DES_NOM_VC")
    private java.lang.String desNomVc;
    @Column(name = "SIM_TIP_VC")
    private java.lang.String simTipVc;
    @Column(name = "FLG_EST_BO")
    private java.lang.Boolean flgEstBo;
    @Column(name = "FEC_CRE_DT")
    private java.sql.Timestamp fecCreDt;
    @Column(name = "IP_CRE_VC")
    private java.lang.String ipCreVc;
    @Column(name = "FEC_MOD_DT")
    private java.sql.Timestamp fecModDt;
    @Column(name = "IP_MOD_VC")
    private java.lang.String ipModVc;
    @Column(name = "FEC_ELI_DT")
    private java.sql.Timestamp fecEliDt;
    @Column(name = "IP_ELI_VC")
    private java.lang.String ipEliVc;

    public CatTipo(){

    }
    public java.lang.Integer getIdTipSi(){
        return this.idTipSi;
    }
    public void setIdTipSi(java.lang.Integer idTipSi){
        this.idTipSi = idTipSi;
    }
    public java.lang.Integer getIdGruIn(){
        return this.idGruIn;
    }
    public void setIdGruIn(java.lang.Integer idGruIn){
        this.idGruIn = idGruIn;
    }
    public java.lang.String getDesNomVc(){
        return this.desNomVc;
    }
    public void setDesNomVc(java.lang.String desNomVc){
        this.desNomVc = desNomVc;
    }
    public java.lang.String getSimTipVc(){
        return this.simTipVc;
    }
    public void setSimTipVc(java.lang.String simTipVc){
        this.simTipVc = simTipVc;
    }
    public java.lang.Boolean getFlgEstBo(){
        return this.flgEstBo;
    }
    public void setFlgEstBo(java.lang.Boolean flgEstBo){
        this.flgEstBo = flgEstBo;
    }
    public java.sql.Timestamp getFecCreDt(){
        return this.fecCreDt;
    }
    public void setFecCreDt(java.sql.Timestamp fecCreDt){
        this.fecCreDt = fecCreDt;
    }
    public java.lang.String getIpCreVc(){
        return this.ipCreVc;
    }
    public void setIpCreVc(java.lang.String ipCreVc){
        this.ipCreVc = ipCreVc;
    }
    public java.sql.Timestamp getFecModDt(){
        return this.fecModDt;
    }
    public void setFecModDt(java.sql.Timestamp fecModDt){
        this.fecModDt = fecModDt;
    }
    public java.lang.String getIpModVc(){
        return this.ipModVc;
    }
    public void setIpModVc(java.lang.String ipModVc){
        this.ipModVc = ipModVc;
    }
    public java.sql.Timestamp getFecEliDt(){
        return this.fecEliDt;
    }
    public void setFecEliDt(java.sql.Timestamp fecEliDt){
        this.fecEliDt = fecEliDt;
    }
    public java.lang.String getIpEliVc(){
        return this.ipEliVc;
    }
    public void setIpEliVc(java.lang.String ipEliVc){
        this.ipEliVc = ipEliVc;
    }
}