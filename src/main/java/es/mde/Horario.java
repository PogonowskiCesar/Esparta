package es.mde;

import java.util.Date;

public class Horario {

	private String dia;
	private Date comienzo;
	private long duracion;

	public String getDia() {
		return dia;
	}

	public void setDia(String dia) {
		this.dia = dia;
	}

	public Date getComienzo() {
		return comienzo;
	}

	public void setComienzo(Date comienzo) {
		this.comienzo = comienzo;
	}

	public long getDuracion() {
		return duracion;
	}

	public void setDuracion(long duracion) {
		this.duracion = duracion;
	}

	public Horario() {
		super();
	}

	public Horario(String dia, Date comienzo, long duracion) {
		super();
		this.dia = dia;
		this.comienzo = comienzo;
		this.duracion = duracion;
	}
	
	

}
