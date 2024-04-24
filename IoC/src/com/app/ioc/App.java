package com.app.ioc;

public class App {
	public static void main(String[] args) {
		// Creamos una instancia de nuestra clase UsuarioFactory e inyectamos la clase que queramos implementar como 
		// UsuarioImplOracle. La inversión de control se da en la inyección de dependencias, al cambiar la inyección 
		// UsuarioImplOracle por UsuarioImplMongo la clase UsuarioFactory no es afectada, una aplicación de la IoC.
		
		UsuarioFactory obj = new UsuarioFactory(new UsuarioImplMongo());
		obj.getInsertoUsuario();
		obj.getEliminoUsuarioByID(1);
	}
}
