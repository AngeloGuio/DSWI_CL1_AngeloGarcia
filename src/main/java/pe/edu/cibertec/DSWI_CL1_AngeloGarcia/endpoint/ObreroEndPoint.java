package pe.edu.cibertec.DSWI_CL1_AngeloGarcia.endpoint;

import lombok.AllArgsConstructor;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import pe.edu.cibertec.ws.objects.GetSalaryRequest;
import pe.edu.cibertec.ws.objects.GetSalaryResponse;

@AllArgsConstructor
@Endpoint
public class ObreroEndPoint {
    private static final String NAMESPACE_URL = "http://www.cibertec.edu.pe/ws/objects";


    @PayloadRoot(namespace =  NAMESPACE_URL,
            localPart = "getSalaryRequest")
    @ResponsePayload
    public GetSalaryResponse getSalary(@RequestPayload GetSalaryRequest request) {
        GetSalaryResponse response = new GetSalaryResponse();
        int horastrabajadas = request.getHorastrabajadas();
        double salary;

        if (horastrabajadas <= 40) {
            salary = horastrabajadas * 16;
        } else {
            salary = 40 * 16 + (horastrabajadas - 40) * 20;
        }

        response.setSalario(salary);
        return response;
    }
}
