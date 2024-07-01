package pe.edu.upc.demoauthor.services;

import pe.edu.upc.demoauthor.dtos.CertificationByUser;
import pe.edu.upc.demoauthor.dtos.InvestmentByUserDTO;

import java.util.List;

public interface ICertificationService {
    List<CertificationByUser> certificationsByUser();

    List<InvestmentByUserDTO> investmentByUser();
}
