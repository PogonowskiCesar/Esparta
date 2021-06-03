package es.mde.usuario;

import es.mde.usuario.UsuarioImpl.TipoUsuario;

public interface Usuario {
	String getNombre();
	String getApellidos();
	String getEmail();
	String getTelefono();
	TipoUsuario getTipoUsuario();

}
