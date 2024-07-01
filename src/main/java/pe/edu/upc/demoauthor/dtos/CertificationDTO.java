package pe.edu.upc.demoauthor.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import pe.edu.upc.demoauthor.entities.User;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CertificationDTO {
    private Long id;
    private String name;
    private LocalDate date;
    private String type;
    private Double price;
    private User user;
}
