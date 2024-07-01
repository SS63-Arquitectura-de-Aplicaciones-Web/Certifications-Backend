package pe.edu.upc.demoauthor.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.demoauthor.services.ICertificationService;

@RestController
@RequestMapping("/segura/certifications")
@CrossOrigin(origins = "http://localhost:4200")
public class CertificationController {
    @Autowired
    private ICertificationService iCertificationService;

    @PreAuthorize("hasAnyAuthority('PROGRAMADOR', 'RECLUTADOR')")
    @GetMapping("/quantityByUser")
    public ResponseEntity<?> certificationsByUser() {
        return new ResponseEntity<>(iCertificationService.certificationsByUser(), HttpStatus.OK);
    }

    @PreAuthorize("hasAnyAuthority('PROGRAMADOR', 'RECLUTADOR')")
    @GetMapping("/investmentByUser")
    public ResponseEntity<?> investmentByUser() {
        return new ResponseEntity<>(iCertificationService.investmentByUser(), HttpStatus.OK);
    }
}
