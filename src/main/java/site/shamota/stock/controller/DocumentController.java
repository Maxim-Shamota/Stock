package site.shamota.stock.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import site.shamota.stock.documents.Admission;
import site.shamota.stock.service.DocumentService;

import java.util.List;

@org.springframework.web.bind.annotation.RestController
@RequestMapping
public class DocumentController {

    DocumentService documentService;

    public DocumentController(DocumentService documentService) {

        this.documentService = documentService;
    }

    @GetMapping("/admission/all")
    public ResponseEntity<List<Admission>> showAllAdmissions() {
        List<Admission> admissionList = documentService.findDocumentAll();
        return ResponseEntity.ok().body(admissionList);
    }

    @GetMapping("/admission/{id}")
    public ResponseEntity<Admission> showAdmissionById(@PathVariable("id") long id) {
        Admission admission = documentService.getDocumentById(id);
        return ResponseEntity.status(HttpStatus.OK).body(admission);
    }

    @PostMapping("/admission/save")
    public ResponseEntity<Admission> saveAdmission(@RequestBody Admission admission) {
        documentService.saveDocument(admission);
        return ResponseEntity.ok().body(admission);
    }

}
