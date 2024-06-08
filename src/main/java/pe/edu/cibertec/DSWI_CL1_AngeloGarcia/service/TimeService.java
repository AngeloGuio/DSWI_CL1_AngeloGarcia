package pe.edu.cibertec.DSWI_CL1_AngeloGarcia.service;

import org.springframework.stereotype.Service;

@Service
public class TimeService {
    public int calculateMinutes(int seconds) {
        return seconds / 60;
    }
}
