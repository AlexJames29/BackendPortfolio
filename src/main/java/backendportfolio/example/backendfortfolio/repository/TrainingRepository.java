package backendportfolio.example.backendfortfolio.repository;

import backendportfolio.example.backendfortfolio.model.Training;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TrainingRepository extends JpaRepository<Training,Long> {
}
