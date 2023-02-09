package backendportfolio.example.backendfortfolio.service;

import backendportfolio.example.backendfortfolio.Dto.HeroDto;
import backendportfolio.example.backendfortfolio.exception.PortfolioNotFoundException;
import backendportfolio.example.backendfortfolio.model.Hero;
import backendportfolio.example.backendfortfolio.repository.HeroRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HeroImpl implements HeroService{

    @Autowired
    HeroRepository heroRepository;
    @Autowired
    private ModelMapper modelMapper;


    @Override
    public List<HeroDto> getAllHero()throws PortfolioNotFoundException {
       List<Hero>  heroList = heroRepository.findAll();
        return heroList.stream().map(hero -> modelMapper.map(hero, HeroDto.class)).toList();
    }

    @Override
    public Hero updateHero(HeroDto heroDto, Long id) {
        Hero hero = heroRepository.findById(id).orElseThrow(()-> new PortfolioNotFoundException(id));
        hero.setBackground(heroDto.getBackground());
        hero.setText(hero.getText());
        return heroRepository.save(hero);
    }
}
