package es.salesianos.edu.spring;

public class Habitacion {

	private static Habitacion habitacion;

	private String cama;

	public String getCama() {
		return cama;
	}

	public void setCama(String cama) {
		this.cama = cama;
	}

	public static Habitacion getHabitacion() {
		return habitacion;
	}

	public static void setHabitacion(Habitacion habitacion) {
		Habitacion.habitacion = habitacion;
	}

}
