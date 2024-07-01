package pe.edu.upc.demoauthor.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class InvestmentByUserDTO {
    private String username;
    private Double investment;
}
