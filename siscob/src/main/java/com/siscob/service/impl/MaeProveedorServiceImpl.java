package com.siscob.service.impl;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.siscob.model.MaeProveedor;
import com.siscob.repository.MaeProveedorJpaRepository;
import com.siscob.service.MaeProveedorService;

@Service("maeProveedorServiceImpl")
public class MaeProveedorServiceImpl implements MaeProveedorService{

	@Autowired
	@Qualifier("maeProveedorJpaRepository")
	private MaeProveedorJpaRepository maeProveedorJpaRepository;

	@Override
	public List<MaeProveedor> listAllMaeProveedores() {
		return maeProveedorJpaRepository.findAll();
	}

	@Override
	public MaeProveedor addMaeProveedor(MaeProveedor maeProveedor) {
		return maeProveedorJpaRepository.save(maeProveedor);
	}

	@Override
	public int removeMaeProveedor(int id) {
		maeProveedorJpaRepository.delete(id);
		return 0;
	}

	@Override
	public MaeProveedor updateMaeProveedor(MaeProveedor maeProveedor) {
		return maeProveedorJpaRepository.save(maeProveedor);
	}
}
