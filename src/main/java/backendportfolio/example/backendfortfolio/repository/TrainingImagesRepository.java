package backendportfolio.example.backendfortfolio.repository;

import backendportfolio.example.backendfortfolio.model.TrainingImages;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TrainingImagesRepository extends JpaRepository<TrainingImages,Long> {
}
