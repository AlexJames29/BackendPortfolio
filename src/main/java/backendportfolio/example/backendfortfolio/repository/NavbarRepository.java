package backendportfolio.example.backendfortfolio.repository;

import backendportfolio.example.backendfortfolio.model.Navbar;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NavbarRepository extends JpaRepository<Navbar,Long> {
}
