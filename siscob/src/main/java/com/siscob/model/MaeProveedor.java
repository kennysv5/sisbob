package com.siscob.model;

import javax.persistence.Id;
import javax.persistence.GeneratedValue;

import java.sql.Date;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "MAE_PROVEEDOR")
public class MaeProveedor {
	
	@Id
	@GeneratedValue
	@Column(name = "ID_PROV_IN")
	private Integer idProvIn;
	
	@Column(name = "NOM_PROV_VC")
	private String nomProvVc;
	
	@Column(name = "FLG_EST_BO")
	private Boolean FlgEstBO;
	
	@Column(name = "USU_CRE_IN")
	private Integer UsuCreIn;
	
	@Column(name = "FEC_CRE_DT")
	private Date fecCreDt;
	
	@Column(name = "IP_CRE_VC")
	private String ipCreVc;
	
	@Column(name = "USU_MOD_IN")
	private Integer UsuModIn;
	
	@Column(name = "FEC_MOD_DT")
	private Date fecModDt;
	
	@Column(name = "IP_MOD_VC")
	private String ipModVc;
	
	@Column(name = "USU_ELI_IN")
	private Integer usuEliIn;
	
	@Column(name = "FEC_ELI_DT")
	private Date FecEliDt;
	
	@Column(name = "IP_ELI_VC")
	private String ipEliVc;
	
	public Integer getIdProvIn() {
		return idProvIn;
	}
	public void setIdProvIn(Integer idProvIn) {
		this.idProvIn = idProvIn;
	}
	public String getNomProvVc() {
		return nomProvVc;
	}
	public void setNomProvVc(String nomProvVc) {
		this.nomProvVc = nomProvVc;
	}
	
	 
	
	public Boolean getFlgEstBO() {
		return FlgEstBO;
	}
	public void setFlgEstBO(Boolean flgEstBO) {
		FlgEstBO = flgEstBO;
	}
	public Integer getUsuCreIn() {
		return UsuCreIn;
	}
	public void setUsuCreIn(Integer usuCreIn) {
		UsuCreIn = usuCreIn;
	}
	public Date getFecCreDt() {
		return fecCreDt;
	}
	public void setFecCreDt(Date fecCreDt) {
		this.fecCreDt = fecCreDt;
	}
	public String getIpCreVc() {
		return ipCreVc;
	}
	public void setIpCreVc(String ipCreVc) {
		this.ipCreVc = ipCreVc;
	}
	public Integer getUsuModIn() {
		return UsuModIn;
	}
	public void setUsuModIn(Integer usuModIn) {
		UsuModIn = usuModIn;
	}
	public Date getFecModDt() {
		return fecModDt;
	}
	public void setFecModDt(Date fecModDt) {
		this.fecModDt = fecModDt;
	}
	public String getIpModVc() {
		return ipModVc;
	}
	public void setIpModVc(String ipModVc) {
		this.ipModVc = ipModVc;
	}
	public Integer getUsuEliIn() {
		return usuEliIn;
	}
	public void setUsuEliIn(Integer usuEliIn) {
		this.usuEliIn = usuEliIn;
	}
	public Date getFecEliDt() {
		return FecEliDt;
	}
	public void setFecEliDt(Date fecEliDt) {
		FecEliDt = fecEliDt;
	}
	public String getIpEliVc() {
		return ipEliVc;
	}
	public void setIpEliVc(String ipEliVc) {
		this.ipEliVc = ipEliVc;
	}
	
	
		

}
