package ejercicio.service.soap.servicesoapdayWeek;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import io.spring.guides.gs_producing_web_service.GetDayRequest;
import io.spring.guides.gs_producing_web_service.GetDayResponse;

@Endpoint
public class DayEndPoint {
    private static final String NAMESPACE_URI = "http://spring.io/guides/gs-producing-web-service";

	private DayRepository dayRepository;

	@Autowired
	public DayEndPoint(DayRepository dayRepository) {
		this.dayRepository = dayRepository;
	}

	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "getDayRequest")
	@ResponsePayload
	public GetDayResponse getdia(@RequestPayload GetDayRequest request) {
		GetDayResponse response = new GetDayResponse();
		response.setDay(dayRepository.findDay(request.getName()));

		return response;
	}
}
