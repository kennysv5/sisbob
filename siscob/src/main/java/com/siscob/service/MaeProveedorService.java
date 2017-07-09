package com.siscob.service;

import java.util.List;
import com.siscob.model.MaeProveedor;

public interface MaeProveedorService {
	
	public abstract List<MaeProveedor> listAllMaeProveedores();
	
	public abstract MaeProveedor addMaeProveedor(MaeProveedor maeProveedor);
	
	public abstract int removeMaeProveedor(int id);
	
	public abstract MaeProveedor updateMaeProveedor(MaeProveedor maeProveedor);

}
