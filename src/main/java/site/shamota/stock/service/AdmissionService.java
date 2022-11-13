package site.shamota.stock.service;

import org.springframework.stereotype.Service;
import site.shamota.stock.documents.Admission;
import site.shamota.stock.repository.AdmissionRepository;

import java.util.List;

@Service
public class AdmissionService {

    private final AdmissionRepository admissionRepository;

    public AdmissionService(AdmissionRepository admissionRepository) {
        this.admissionRepository = admissionRepository;
    }

    public Admission getById(long id) {
        return admissionRepository.findById(id).orElse(null);
    }

    public List<Admission> findAll() {
        return admissionRepository.findAll();
    }

    public void saveAdmission(Admission admission) {
        admissionRepository.save(admission);
    }

}
