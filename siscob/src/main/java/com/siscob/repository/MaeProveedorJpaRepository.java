package com.siscob.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.siscob.model.MaeProveedor;

@Repository("maeProveedorJpaRepository")
public interface MaeProveedorJpaRepository extends JpaRepository<MaeProveedor, Serializable> {
	
	/*public abstract MaeProveedor findByUsuCreSi(int usuCreSi);
	
	public abstract MaeProveedor findByUsuCreSiAndIpCreVc(int usuCreSi,String ipCreVc);
	
	public abstract List<MaeProveedor> findByUsuCreSiOrderByDesRolVc(int usuCreSi);
	
	public abstract MaeProveedor findByUsuCreSiOrIpCreVc(int usuCreSi,String ipCreVc);*/

}
