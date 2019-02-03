package es.salesianos.edu.spring;

import org.springframework.stereotype.Component;

@Component("baño")
public class Baño {

	private static Baño baño;

	public void limpiarToilet() {
		System.out.println("que sucio");
	}

	public static Baño getBaño() {
		return baño;
	}

	public static void setBaño(Baño baño) {
		Baño.baño = baño;
	}


}
