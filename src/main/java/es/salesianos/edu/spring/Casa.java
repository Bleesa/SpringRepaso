package es.salesianos.edu.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.AutowireCapableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class Casa {

	@Autowired
	private static Salon salon;

	@Autowired
	private static Baño baño;

	@Autowired
	@Qualifier("habitacionGrande")
	private static Habitacion habitacion;

	public static void main(String[] args) {
		new Casa();
	}

	public Casa() {

		ApplicationContext context = new ClassPathXmlApplicationContext("spring-context.xml");
		AutowireCapableBeanFactory acbFactory = context.getAutowireCapableBeanFactory();
		acbFactory.autowireBean(this);
		// setSalon((Salon) context.getBean("salon"));
		// Baño baño = (Baño) context.getBean("baño");
		// Habitacion habitacion = (Habitacion) context.getBean("habitacionGrande");

		// baño.limpiarToilet();
		salon.tengoUnaMesa();
		baño.limpiarToilet();
		System.out.println(habitacion.getCama());
	}


}
