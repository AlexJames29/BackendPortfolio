package backendportfolio.example.backendfortfolio.service;

import backendportfolio.example.backendfortfolio.Dto.AchievementsDto;
import backendportfolio.example.backendfortfolio.exception.PortfolioNotFoundException;
import backendportfolio.example.backendfortfolio.model.Achievements;
import backendportfolio.example.backendfortfolio.repository.AchievementsRepository;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.*;
import java.util.List;
import java.util.Optional;

@Service
public class AchievementsImpl implements AchievementsService {
    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private AchievementsRepository achievementsRepository;


    @Override
    public List<AchievementsDto> getAchievements() throws PortfolioNotFoundException {
        List<Achievements> achievements = achievementsRepository.findAll();
        return achievements.stream().map(achievementsData -> modelMapper.map(achievementsData, AchievementsDto.class)).toList();
    }

    @Override
    public Achievements updateAchievements(AchievementsDto achievementsDto, Long id) {
        Achievements achieve = achievementsRepository.findById(id).orElseThrow(() -> new PortfolioNotFoundException(id));
        achieve.setAvatar(achievementsDto.getAvatar());
        achieve.setTitle(achievementsDto.getTitle());
        achieve.setDescription(achievementsDto.getDescription());
        modelMapper.map(achievementsDto, achieve);
        return achievementsRepository.save(achieve);
    }
}
//    AchievementsDto achieveDto = new AchievementsDto();
//    Achievements achievements = findAchievements(id);
//    Optional<Achievements> achievementsRepository.
//        findById(id).orElseThrow(() -> new PortfolioNotFoundException(id));
//        achievements.setTitle(achieveDto.getTitle());
//        achievements.setDescription(achieveDto.getDescription());
//        achievements.setAvatar(achieveDto.getAvatar());
//        return achievementsRepository.save(achievements);
//        }