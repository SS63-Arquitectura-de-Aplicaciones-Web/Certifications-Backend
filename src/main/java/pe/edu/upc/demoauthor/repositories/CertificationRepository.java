package pe.edu.upc.demoauthor.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.upc.demoauthor.dtos.CertificationByUser;
import pe.edu.upc.demoauthor.dtos.InvestmentByUserDTO;
import pe.edu.upc.demoauthor.entities.Certification;

import java.util.List;

@Repository
public interface CertificationRepository extends JpaRepository<Certification, Long> {
    @Query("select new pe.edu.upc.demoauthor.dtos.CertificationByUser(c.user.username, count(c.id)) from Certification c group by c.user.username")
    List<CertificationByUser>certificationsByUser();

    @Query("select new pe.edu.upc.demoauthor.dtos.InvestmentByUserDTO(c.user.username, sum(c.price)) from Certification c group by c.user.username")
    List<InvestmentByUserDTO>investmentByUser();
}
