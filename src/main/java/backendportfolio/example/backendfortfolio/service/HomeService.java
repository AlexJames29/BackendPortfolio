package backendportfolio.example.backendfortfolio.service;

import backendportfolio.example.backendfortfolio.Dto.HomeDto;
import backendportfolio.example.backendfortfolio.Dto.HomeImageDto;
import backendportfolio.example.backendfortfolio.model.Home;
import backendportfolio.example.backendfortfolio.model.HomeImage;

import java.util.List;

public interface HomeService {

    List<HomeDto>getAllHome();
    Home updateHome(HomeDto homeDto,Long id);

    List<HomeImageDto>getAllHomeImg();

    HomeImage updateHomeImg(HomeImageDto homeImageDto,Long id);
}
