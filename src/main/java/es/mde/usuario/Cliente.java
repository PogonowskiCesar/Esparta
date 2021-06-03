package es.mde.usuario;

public class Cliente extends UsuarioImpl {

	public Cliente() {
		super();
	}

	public Cliente(String nombre, String apellidos, String email, String telefono) {
		super(nombre, apellidos, email, telefono);
	}

}
