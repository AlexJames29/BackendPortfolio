package backendportfolio.example.backendfortfolio.repository;

import backendportfolio.example.backendfortfolio.model.Form;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FormRepository extends JpaRepository<Form,Long> {
}
