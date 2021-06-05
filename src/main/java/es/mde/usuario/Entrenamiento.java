package es.mde.usuario;

public class Entrenamiento {

	private String tipoEntrenamiento;
	private String descripcion;

	public enum Intensidad {
		FACIL, MEDIA, DURA
	};

	private Intensidad intensidad;

	public String getTipoEntrenamiento() {
		return tipoEntrenamiento;
	}

	public void setTipoEntrenamiento(String tipoEntrenamiento) {
		this.tipoEntrenamiento = tipoEntrenamiento;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Intensidad getIntensidad() {
		return intensidad;
	}

	public void setIntensidad(Intensidad intensidad) {
		this.intensidad = intensidad;
	}

	public Entrenamiento() {
		super();
	}

	public Entrenamiento(String tipoEntrenamiento, String descripcion, Intensidad intensidad) {
		super();
		this.tipoEntrenamiento = tipoEntrenamiento;
		this.descripcion = descripcion;
		this.intensidad = intensidad;
	}

}
