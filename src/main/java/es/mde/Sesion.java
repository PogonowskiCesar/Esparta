package es.mde;

import java.time.LocalDateTime;


public class Sesion {

	private LocalDateTime dia;
	private long duracion;

	public LocalDateTime getDia() {
		return dia;
	}
	
	public void setDia(LocalDateTime dia) {
		this.dia = dia;
	}

	public long getDuracion() {
		return duracion;
	}

	public void setDuracion(long duracion) {
		this.duracion = duracion;
	}

	public Sesion() {
		super();
	}

	public Sesion(LocalDateTime dia, long duracion) {
		super();
		this.dia = dia;
		this.duracion = duracion;
	}

	
	
	

}
