package pe.edu.cibertec.DSWI_CL1_AngeloGarcia.endpoint;

import lombok.AllArgsConstructor;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import pe.edu.cibertec.DSWI_CL1_AngeloGarcia.exception.NotFountException;
import pe.edu.cibertec.DSWI_CL1_AngeloGarcia.service.MedicoService;
import pe.edu.cibertec.ws.objects.*;

@AllArgsConstructor
@Endpoint
public class MedicoEndPoint {

    private MedicoService medicoService;

    private static final String NAMESPACE_URL = "http://www.cibertec.edu.pe/ws/objects";

    @PayloadRoot(namespace = NAMESPACE_URL, localPart = "getMedicosRequest")
    @ResponsePayload
    public GetMedicosResponse getDomicilios(@RequestPayload
                                            GetMedicosRequest request){
        GetMedicosResponse response = new GetMedicosResponse();
        response.getMedicos().addAll(medicoService.listarMedicos());
        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URL, localPart = "getMedicoRequest")
    @ResponsePayload
    public GetMedicoResponse getDomicilio(@RequestPayload
                                          GetMedicoRequest request){
        GetMedicoResponse response = new GetMedicoResponse();
        Medicows medicows = medicoService.obtenerMedicoxId(request.getId());
        if(medicows == null)
            throw new NotFountException("El domicilio con el ID " + request.getId()+" no existe!");
        response.setMedico(medicows);
        return response;
    }
    @PayloadRoot(namespace = NAMESPACE_URL, localPart = "postMedicoRequest")
    @ResponsePayload
    public PostMedicoResponse saveDomicilio(@RequestPayload
                                               PostMedicoRequest request){
        PostMedicoResponse response = new PostMedicoResponse();
        response.setMedico(medicoService.registrarActualizarMedico(
                request.getMedico()));
        return response;
    }


}
