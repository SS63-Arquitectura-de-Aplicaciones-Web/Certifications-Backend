package pe.edu.upc.demoauthor.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.demoauthor.dtos.CertificationByUser;
import pe.edu.upc.demoauthor.dtos.InvestmentByUserDTO;
import pe.edu.upc.demoauthor.repositories.CertificationRepository;
import pe.edu.upc.demoauthor.services.ICertificationService;

import java.util.List;

@Service
public class CertificationServiceImpl implements ICertificationService {
    @Autowired
    private CertificationRepository certificationRepository;
    public List<CertificationByUser>certificationsByUser(){
        return certificationRepository.certificationsByUser();
    }
    public List<InvestmentByUserDTO>investmentByUser(){
        return certificationRepository.investmentByUser();
    }
}
