package pe.edu.cibertec.DSWI_CL1_AngeloGarcia.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.cibertec.DSWI_CL1_AngeloGarcia.model.Medico;

@Repository
public interface MedicoRepository  extends JpaRepository<Medico, Integer> {
}
