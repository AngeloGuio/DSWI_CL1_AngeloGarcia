package pe.edu.cibertec.DSWI_CL1_AngeloGarcia.endpoint;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import pe.edu.cibertec.DSWI_CL1_AngeloGarcia.service.CalculationService;
import pe.edu.cibertec.ws.objects.CalculationRequest;
import pe.edu.cibertec.ws.objects.CalculationResponse;
@Endpoint
public class CalculationEndPoint {
    private static final String NAMESPACE_URL = "http://www.cibertec.edu.pe/ws/objects";

    private final CalculationService calculationService;

    @Autowired
    public CalculationEndPoint(CalculationService calculationService) {
        this.calculationService = calculationService;
    }

    @PayloadRoot(namespace = NAMESPACE_URL, localPart = "CalculationRequest")
    @ResponsePayload
    public CalculationResponse calculate(@RequestPayload CalculationRequest request) {
        return calculationService.calculate(request.getNumber());
    }
}
