package pe.edu.cibertec.DSWI_CL1_AngeloGarcia.endpoint;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import pe.edu.cibertec.DSWI_CL1_AngeloGarcia.service.TimeService;
import pe.edu.cibertec.ws.objects.GetMinutesRequest;
import pe.edu.cibertec.ws.objects.GetMinutesResponse;
@AllArgsConstructor
@Endpoint
public class TimeEndPoinr {
    private static final String NAMESPACE_URL = "http://www.example.com/objects";

    @Autowired
    private TimeService timeService;

    @PayloadRoot(namespace = NAMESPACE_URL, localPart = "getMinutesRequest")
    @ResponsePayload
    public GetMinutesResponse getMinutes(@RequestPayload GetMinutesRequest request) {
        int seconds = request.getSeconds();
        int minutes = timeService.calculateMinutes(seconds);

        GetMinutesResponse response = new GetMinutesResponse();
        response.setMinutes(minutes);

        return response;
    }
}
