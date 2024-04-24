package com.app.ioc;

public class UsuarioFactory {
	
	IUsuario usr;
	
	public UsuarioFactory(IUsuario usr) {
		this.usr = usr;
	}
	
	public void getInsertoUsuario() {
		usr.insertaUsuario();
	}
	
	public void getEliminoUsuarioByID(int id) {
		usr.eliminaUsuarioByID(id);
	}
}
