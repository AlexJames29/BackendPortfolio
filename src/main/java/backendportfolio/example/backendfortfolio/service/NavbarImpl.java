package backendportfolio.example.backendfortfolio.service;

import backendportfolio.example.backendfortfolio.Dto.NavbarDto;
import backendportfolio.example.backendfortfolio.exception.PortfolioNotFoundException;
import backendportfolio.example.backendfortfolio.model.Navbar;
import backendportfolio.example.backendfortfolio.repository.NavbarRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NavbarImpl implements NavbarService{
    @Autowired
    NavbarRepository navbarRepository;
    @Autowired
    private ModelMapper modelMapper;


    @Override
    public List<NavbarDto> getAllNavbar() throws PortfolioNotFoundException {
        List<Navbar> navbarList =navbarRepository.findAll();
        return navbarList.stream().map(navbar -> modelMapper.map(navbar, NavbarDto.class)).toList();

    }

    @Override
    public Navbar updateAchievements(NavbarDto navbarDto, Long id) {
        Navbar nav= navbarRepository.findById(id).orElseThrow(()->new PortfolioNotFoundException(id));
        nav.setAchievements(navbarDto.getAchievements());
        nav.setName(navbarDto.getName());
        nav.setHomes(navbarDto.getHomes());
        nav.setContact(navbarDto.getContact());
        nav.setTraining(navbarDto.getTraining());

        return navbarRepository.save(nav);
    }
}
