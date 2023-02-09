package backendportfolio.example.backendfortfolio.service;


import backendportfolio.example.backendfortfolio.Dto.AchievementsDto;
import backendportfolio.example.backendfortfolio.Dto.NavbarDto;
import backendportfolio.example.backendfortfolio.model.Navbar;
import lombok.Data;

import java.util.List;


public interface NavbarService {

List<NavbarDto>getAllNavbar();
Navbar updateAchievements(NavbarDto navbarDto,Long id);


}
