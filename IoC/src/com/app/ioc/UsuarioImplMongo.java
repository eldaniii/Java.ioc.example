package com.app.ioc;

public class UsuarioImplMongo implements IUsuario {

	@Override
	public void insertaUsuario() {
		System.out.println("Insertando Usuario en Mongo");
	}

	@Override
	public void eliminaUsuarioByID(int id) {
		System.out.println("Eliminando Usuario en Mongo: " + id);
	}

}
