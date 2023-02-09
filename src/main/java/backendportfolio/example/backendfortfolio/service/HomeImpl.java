package backendportfolio.example.backendfortfolio.service;

import backendportfolio.example.backendfortfolio.Dto.HomeDto;
import backendportfolio.example.backendfortfolio.Dto.HomeImageDto;
import backendportfolio.example.backendfortfolio.exception.PortfolioNotFoundException;
import backendportfolio.example.backendfortfolio.model.Home;
import backendportfolio.example.backendfortfolio.model.HomeImage;
import backendportfolio.example.backendfortfolio.repository.HomeImageRepository;
import backendportfolio.example.backendfortfolio.repository.HomeRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HomeImpl implements HomeService {
    @Autowired
    HomeRepository homeRepository;
    @Autowired
    HomeImageRepository homeImageRepository;
    @Autowired
    private ModelMapper modelMapper;


    @Override
    public List<HomeDto> getAllHome() throws PortfolioNotFoundException {
        List<Home> homeList = homeRepository.findAll();
        return homeList.stream().map(home -> modelMapper.map(home, HomeDto.class)).toList();
    }

    @Override
    public Home updateHome(HomeDto homeDto, Long id) {
        Home home = homeRepository.findById(id).orElseThrow(() -> new PortfolioNotFoundException(id));
        home.setName(homeDto.getName());
        home.setAchievements(homeDto.getAchievements());
        home.setGreetings(home.getGreetings());
        home.setLaunch(homeDto.getLaunch());
        home.setOccupation(homeDto.getOccupation());
        return homeRepository.save(home);
    }

    @Override
    public List<HomeImageDto> getAllHomeImg() throws PortfolioNotFoundException {
       List<HomeImage> homeImageList= homeImageRepository.findAll();
        return homeImageList.stream().map(homeImage -> modelMapper.map(homeImage,HomeImageDto.class)).toList();
    }

    @Override
    public HomeImage updateHomeImg(HomeImageDto homeImageDto, Long id) {
        HomeImage homeImage = homeImageRepository.findById(id).orElseThrow(()-> new PortfolioNotFoundException(id));
        homeImage.setImages(homeImageDto.getImages());
        return homeImageRepository.save(homeImage);
    }
}
