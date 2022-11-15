package site.shamota.stock.service;

import org.springframework.stereotype.Service;
import site.shamota.stock.documents.Admission;
import site.shamota.stock.repository.AdmissionRepository;

import java.util.List;

@Service
public class DocumentService {

    private final AdmissionRepository admissionRepository;

    public DocumentService(AdmissionRepository admissionRepository) {
        this.admissionRepository = admissionRepository;
    }

    public Admission getDocumentById(long id) {
        return admissionRepository.findById(id).orElse(null);
    }

    public List<Admission> findDocumentAll() {
        return admissionRepository.findAll();
    }

    public void saveDocument(Admission admission) {
        admissionRepository.save(admission);
    }

}
