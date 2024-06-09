package pe.edu.cibertec.DSWI_CL1_AngeloGarcia.convert;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import pe.edu.cibertec.DSWI_CL1_AngeloGarcia.model.Medico;
import pe.edu.cibertec.ws.objects.Medicows;

import java.util.ArrayList;
import java.util.List;

@Component
public class MedicoConvert {
    public Medico convertMedicowsToMedico(Medicows medicows){
        Medico medico  = new Medico();
        medico.setIdmedico(medicows.getIdmedico());
        medico.setNommedico(medicows.getNommedico());
        medico.setApemedico(medicows.getApemedico());
        medico.setFechnacmedico(medicows.getFechnacmedico());
        return medico;

    }

    public List<Medico> convertMedicowsToMedico(List<Medicows> medicows){
        List<Medico> medicoList = new ArrayList<>();
        medicows.forEach(mec ->{
            medicoList.add(convertMedicowsToMedico(mec));
        });
        return medicoList;
    }
    public Medicows convertMedicoToMedicoWs(Medico medico){
        Medicows medicows = new Medicows();
        medicows.setIdmedico(medico.getIdmedico());
        medicows.setNommedico(medico.getNommedico());
        medicows.setApemedico(medico.getApemedico());
        medicows.setFechnacmedico(medico.getFechnacmedico());
        return medicows;
    }
    public List<Medicows> convertMedicoToMedicoWs(List<Medico> medico){
        List<Medicows> medicoList = new ArrayList<>();
        medico.forEach(mec ->{
            medicoList.add(convertMedicoToMedicoWs(mec));
        });
        return medicoList;
    }
}
