package ejercicio.service.soap.servicesoapdayWeek;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

import io.spring.guides.gs_producing_web_service.Day;
import jakarta.annotation.PostConstruct;

@Component
public class DayRepository {
    
     private static final Map<String, Day> dias = new HashMap<>();

	/**
	 * 
	 */
	@PostConstruct
	public void initData() {
		Day lunes = new Day();
		lunes.setDay("Lunes");
		lunes.setDayinEnglish("Monday");
		
		dias.put(lunes.getDay(), lunes);

		Day martes = new Day();
		martes.setDay("Martes");
		martes.setDayinEnglish("Tuesday");

        dias.put(martes.getDay(),martes);

        Day miercoles = new Day();
		miercoles.setDay("Miercoles");
		miercoles.setDayinEnglish("Wednesday");

        dias.put(miercoles.getDay(),miercoles);

        Day jueves = new Day();
		jueves.setDay("Jueves");
		jueves.setDayinEnglish("Thursday");

        dias.put(jueves.getDay(),jueves);

        Day viernes = new Day();
		viernes.setDay("Viernes");
		viernes.setDayinEnglish("Friday");

        dias.put(viernes.getDay(),viernes);

        Day sabado = new Day();
		sabado.setDay("Sabado");
		sabado.setDayinEnglish("Saturday");

        dias.put(sabado.getDay(),sabado);

        Day domingo = new Day();
		domingo.setDay("Domingo");
		domingo.setDayinEnglish("Sunday");

        dias.put(domingo.getDay(),domingo);
		
	}

	public Day findDay(String name) {
		Assert.notNull(name, "No se encontro el dia");
		return dias.get(name);
	}
}
