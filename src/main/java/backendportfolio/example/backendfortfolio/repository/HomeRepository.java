package backendportfolio.example.backendfortfolio.repository;

import backendportfolio.example.backendfortfolio.model.Home;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HomeRepository extends JpaRepository<Home,Long> {
}
