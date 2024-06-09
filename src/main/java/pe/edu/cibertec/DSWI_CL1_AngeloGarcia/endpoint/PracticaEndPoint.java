package pe.edu.cibertec.DSWI_CL1_AngeloGarcia.endpoint;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import pe.edu.cibertec.DSWI_CL1_AngeloGarcia.service.PracticaService;
import pe.edu.cibertec.ws.objects.GetPracticasRequest;
import pe.edu.cibertec.ws.objects.GetPracticasResponse;
@AllArgsConstructor
@Endpoint
public class PracticaEndPoint {
    private static final String NAMESPACE_URL = "http://www.example.com/objects";

    @Autowired
    private PracticaService gradeService;

    @PayloadRoot(namespace = NAMESPACE_URL, localPart = "getPracticasRequest")
    @ResponsePayload
    public GetPracticasResponse getGrades(@RequestPayload GetPracticasRequest request) {
        int[] grades = request.getPracticas().stream().mapToInt(i -> i).toArray();

        double promedio = gradeService.calculateAverage(grades);
        int menorPractica = gradeService.getLowestGrade(grades);

        GetPracticasResponse response = new GetPracticasResponse();
        response.setPromedio(promedio);
        response.setMenorpractica(menorPractica);

        return response;
    }
}
