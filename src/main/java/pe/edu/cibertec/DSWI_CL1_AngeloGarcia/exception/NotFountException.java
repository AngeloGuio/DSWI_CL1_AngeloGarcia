package pe.edu.cibertec.DSWI_CL1_AngeloGarcia.exception;

import org.springframework.ws.soap.server.endpoint.annotation.FaultCode;
import org.springframework.ws.soap.server.endpoint.annotation.SoapFault;

@SoapFault(faultCode = FaultCode.SERVER)
public class NotFountException extends RuntimeException {
    public NotFountException(String message) {
        super(message);
    }
}

