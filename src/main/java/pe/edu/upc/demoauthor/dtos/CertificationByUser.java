package pe.edu.upc.demoauthor.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CertificationByUser {
    private String username;
    private Long numberCertifications;
}
