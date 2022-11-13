package site.shamota.stock.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import site.shamota.stock.documents.Admission;
import site.shamota.stock.service.AdmissionService;

@org.springframework.web.bind.annotation.RestController
@RequestMapping
public class AdmissionController {

    AdmissionService admissionService;

    public AdmissionController(AdmissionService admissionService) {

        this.admissionService = admissionService;
    }

    @PostMapping("/admission")
    public ResponseEntity<Admission> saveAdmission(@RequestBody Admission admission) {
        admissionService.saveAdmission(admission);
        return ResponseEntity.ok().body(admission);
    }
}
