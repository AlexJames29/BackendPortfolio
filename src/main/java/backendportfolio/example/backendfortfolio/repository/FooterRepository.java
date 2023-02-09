package backendportfolio.example.backendfortfolio.repository;

import backendportfolio.example.backendfortfolio.model.Footer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FooterRepository extends JpaRepository<Footer,Long> {
}
