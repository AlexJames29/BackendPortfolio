package backendportfolio.example.backendfortfolio.controller;

import backendportfolio.example.backendfortfolio.Dto.HomeDto;
import backendportfolio.example.backendfortfolio.Dto.HomeImageDto;
import backendportfolio.example.backendfortfolio.exception.PortfolioNotFoundException;
import backendportfolio.example.backendfortfolio.model.Home;
import backendportfolio.example.backendfortfolio.model.HomeImage;
import backendportfolio.example.backendfortfolio.service.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/homes")
public class HomeController {

    @Autowired
    private HomeService homeService;

    @GetMapping("/home")
    public ResponseEntity<List<HomeDto>> getAllHome()throws PortfolioNotFoundException{
        List<HomeDto>homeDtoList=homeService.getAllHome();
        return new ResponseEntity<>(homeDtoList, HttpStatus.OK);
    }
    @PutMapping("/{id}")
    public ResponseEntity<Home>update(@RequestBody HomeDto homeDto,@PathVariable long id) throws  PortfolioNotFoundException{
        return new ResponseEntity<>(homeService.updateHome(homeDto,id),HttpStatus.ACCEPTED);
    }
    @GetMapping("/homeImg")
    public ResponseEntity<List<HomeImageDto>>getAllHomeImg()throws PortfolioNotFoundException{
        List<HomeImageDto> homeImageDtoList = homeService.getAllHomeImg();
        return new ResponseEntity<>(homeImageDtoList,HttpStatus.OK);
    }
    @PutMapping("/img/{id}")
    public ResponseEntity<HomeImage> update(@RequestBody HomeImageDto homeImageDto,@PathVariable Long id) throws PortfolioNotFoundException{
        return new ResponseEntity<>(homeService.updateHomeImg(homeImageDto,id),HttpStatus.ACCEPTED);
    }
}
