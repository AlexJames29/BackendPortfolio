package backendportfolio.example.backendfortfolio.service;

import backendportfolio.example.backendfortfolio.Dto.AchievementsDto;
import backendportfolio.example.backendfortfolio.model.Achievements;

import java.util.List;

public interface AchievementsService {
    List<AchievementsDto> getAchievements();
    Achievements updateAchievements(AchievementsDto achievementsDto, Long id);
}
