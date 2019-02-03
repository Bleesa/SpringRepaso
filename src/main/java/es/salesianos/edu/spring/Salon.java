package es.salesianos.edu.spring;

public class Salon {

	private static Salon salon;

	public void tengoUnaTelevision() {
		System.out.println("vamos a ver la teles");
	}

	public void tengoUnaMesa() {
		System.out.println("vamos a comer");
	}

	public static Salon getSalon() {
		return salon;
	}

	public static void setSalon(Salon salon) {
		Salon.salon = salon;
	}

}
