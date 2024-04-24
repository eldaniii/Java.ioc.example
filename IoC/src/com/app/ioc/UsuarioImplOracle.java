package com.app.ioc;

public class UsuarioImplOracle implements IUsuario {

	@Override
	public void insertaUsuario() {
		System.out.println("Insertando Usuario en Oracle");
	}

	@Override
	public void eliminaUsuarioByID(int id) {
		System.out.println("Eliminando Usuario en Oracle: " + id);
	}
	
}
