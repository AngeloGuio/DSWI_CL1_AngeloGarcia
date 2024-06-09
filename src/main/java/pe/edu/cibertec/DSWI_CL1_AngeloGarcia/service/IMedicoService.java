package pe.edu.cibertec.DSWI_CL1_AngeloGarcia.service;

import pe.edu.cibertec.ws.objects.Medicows;


import java.util.List;

public interface IMedicoService {
    List<Medicows> listarMedicos();
    Medicows obtenerMedicoxId(int id);

    Medicows registrarActualizarMedico(Medicows medico);

}
