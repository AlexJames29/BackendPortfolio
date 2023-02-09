package backendportfolio.example.backendfortfolio.controller;

import backendportfolio.example.backendfortfolio.Dto.AchievementsDto;
import backendportfolio.example.backendfortfolio.exception.PortfolioNotFoundException;
import backendportfolio.example.backendfortfolio.model.Achievements;
import backendportfolio.example.backendfortfolio.service.AchievementsService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/achievements")
public class AchievementsController {
    @Autowired
    private ModelMapper modelMapper;
    @Autowired
    private AchievementsService achievementsService;

    @GetMapping("/achievement")
    public ResponseEntity<List<AchievementsDto>> getAchieve() throws PortfolioNotFoundException{
        List<AchievementsDto> achievementsDto = achievementsService.getAchievements();
        return new ResponseEntity<>(achievementsDto, HttpStatus.OK);
    }
    @PutMapping("/{id}")
    public ResponseEntity<Achievements> update(@RequestBody AchievementsDto achievementsDto, @PathVariable long id) throws PortfolioNotFoundException{
        return new ResponseEntity<>(achievementsService.updateAchievements(achievementsDto,id),HttpStatus.ACCEPTED);
    }
}


//    @PostMapping("")
//    public ResponseEntity<AchievementsDto> addAchievements(@RequestBody )
//}
