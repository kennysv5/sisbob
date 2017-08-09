package com.siscob.model;

import javax.persistence.CascadeType;
import java.io.Serializable;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Column;
import java.util.Set;
import javax.persistence.OneToMany;
import javax.persistence.JoinColumn;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "CAT_GRUPO")
public class CatGrupo implements Serializable{

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "ID_GRU_IN")
    private java.lang.Integer idGruInt;
    @Column(name = "DES_NOM_VC")
    private java.lang.String desNomVc;
    @Column(name = "FLG_EST_BO")
    private java.lang.Boolean flgEstBo;
    
    public CatGrupo(){

    }
    public java.lang.Integer getIdGruIn(){
        return this.idGruInt;
    }
    public void setIdGruIn(java.lang.Integer idGruIn){
        this.idGruInt = idGruIn;
    }
    public java.lang.String getDesNomVc(){
        return this.desNomVc;
    }
    public void setDesNomVc(java.lang.String desNomVc){
        this.desNomVc = desNomVc;
    }
    public java.lang.Boolean getFlgEstBo(){
        return this.flgEstBo;
    }
    public void setFlgEstBo(java.lang.Boolean flgEstBo){
        this.flgEstBo = flgEstBo;
    }
   
}