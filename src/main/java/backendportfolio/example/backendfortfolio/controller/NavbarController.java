package backendportfolio.example.backendfortfolio.controller;

import backendportfolio.example.backendfortfolio.Dto.NavbarDto;
import backendportfolio.example.backendfortfolio.exception.PortfolioNotFoundException;
import backendportfolio.example.backendfortfolio.model.Navbar;
import backendportfolio.example.backendfortfolio.service.NavbarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/navbars")
public class NavbarController {
    @Autowired
    private NavbarService navbarService;

    @GetMapping("/navbar")
    public ResponseEntity<List<NavbarDto>>getAllNav()throws PortfolioNotFoundException{
        List<NavbarDto>navbarDtoList=navbarService.getAllNavbar();
        return new ResponseEntity<>(navbarDtoList, HttpStatus.OK);
    }
    @PutMapping("/{id}")
    public ResponseEntity<Navbar> update(@RequestBody NavbarDto navbarDto, @PathVariable long id)throws PortfolioNotFoundException{
        return new ResponseEntity<>(navbarService.updateAchievements(navbarDto,id),HttpStatus.ACCEPTED);
    }
}
