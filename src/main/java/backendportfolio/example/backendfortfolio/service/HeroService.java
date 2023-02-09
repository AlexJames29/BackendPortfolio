package backendportfolio.example.backendfortfolio.service;

import backendportfolio.example.backendfortfolio.Dto.HeroDto;
import backendportfolio.example.backendfortfolio.Dto.HomeDto;
import backendportfolio.example.backendfortfolio.model.Hero;

import java.util.List;

public interface HeroService {
    List<HeroDto>getAllHero();
    Hero updateHero(HeroDto heroDto, Long id);
}
