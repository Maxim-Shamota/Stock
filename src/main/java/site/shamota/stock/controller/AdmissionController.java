package site.shamota.stock.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import site.shamota.stock.documents.Admission;
import site.shamota.stock.service.AdmissionService;

import java.util.List;

@org.springframework.web.bind.annotation.RestController
@RequestMapping
public class AdmissionController {

    AdmissionService admissionService;

    public AdmissionController(AdmissionService admissionService) {

        this.admissionService = admissionService;
    }

    @GetMapping("/admission/all")
    public ResponseEntity<List<Admission>> showAllAdmissions() {
        List<Admission> admissionList = admissionService.findAll();
        return ResponseEntity.ok().body(admissionList);
    }

    @GetMapping("/admission/{id}")
    public ResponseEntity<Admission> showAdmissionById(@PathVariable("id") long id) {
        Admission admission = admissionService.getById(id);
        return ResponseEntity.status(HttpStatus.OK).body(admission);
    }

    @PostMapping("/admission/save")
    public ResponseEntity<Admission> saveAdmission(@RequestBody Admission admission) {
        admissionService.saveAdmission(admission);
        return ResponseEntity.ok().body(admission);
    }
}
