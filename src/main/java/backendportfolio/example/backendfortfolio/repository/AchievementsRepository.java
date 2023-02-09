package backendportfolio.example.backendfortfolio.repository;

import backendportfolio.example.backendfortfolio.model.Achievements;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AchievementsRepository extends JpaRepository<Achievements, Long> {
}
