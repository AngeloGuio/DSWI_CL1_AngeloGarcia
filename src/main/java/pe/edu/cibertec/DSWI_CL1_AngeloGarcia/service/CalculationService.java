package pe.edu.cibertec.DSWI_CL1_AngeloGarcia.service;

import org.springframework.stereotype.Service;
import pe.edu.cibertec.ws.objects.CalculationResponse;
@Service
public class CalculationService {
    public CalculationResponse calculate(int number) {
        CalculationResponse response = new CalculationResponse();
        response.setSquare(number * number);
        response.setHalf(number / 2.0);
        return response;
    }
}
