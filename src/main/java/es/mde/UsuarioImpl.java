package es.mde;

public class UsuarioImpl implements Usuario {
	private String nombre;
	private String apellidos;
	private String email;
	private String telefono;

	public static enum TipoUsuario {
		ADMIN, ENTRENADOR, CLIENTE;

		@Override
		public String toString() {

			return name();
		}

	};

	private TipoUsuario tipoUsuario;

	@Override
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	@Override
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	@Override
	public TipoUsuario getTipoUsuario() {
		return tipoUsuario;
	}

	public void setTipoUsuario(TipoUsuario tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}

	public UsuarioImpl() {

	}

	public UsuarioImpl(String nombre, String apellidos, String email, String telefono) {

		this.nombre = nombre;
		this.apellidos = apellidos;
		this.email = email;
		this.telefono = telefono;

	}

}
