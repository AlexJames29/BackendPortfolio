package backendportfolio.example.backendfortfolio.controller;

import backendportfolio.example.backendfortfolio.Dto.FormDto;
import backendportfolio.example.backendfortfolio.Dto.HeroDto;
import backendportfolio.example.backendfortfolio.exception.PortfolioNotFoundException;
import backendportfolio.example.backendfortfolio.model.Form;
import backendportfolio.example.backendfortfolio.model.Hero;
import backendportfolio.example.backendfortfolio.repository.HeroRepository;
import backendportfolio.example.backendfortfolio.service.HeroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hero")
public class HeroController {

    @Autowired
    private HeroService heroService;

    @GetMapping("/herow")
    public ResponseEntity<List<HeroDto>> getheros() throws PortfolioNotFoundException {
        List<HeroDto> heroDtoList = heroService.getAllHero();
        return new ResponseEntity<>(heroDtoList, HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Hero> update(@RequestBody HeroDto heroDto, @PathVariable long id) throws PortfolioNotFoundException {
        return new ResponseEntity<>(heroService.updateHero(heroDto, id), HttpStatus.OK);
    }


}
