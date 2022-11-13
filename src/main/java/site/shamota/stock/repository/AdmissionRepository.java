package site.shamota.stock.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import site.shamota.stock.documents.Admission;

@Repository
public interface AdmissionRepository extends JpaRepository<Admission, Long> {
}
