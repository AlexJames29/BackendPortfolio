package backendportfolio.example.backendfortfolio.service;

import backendportfolio.example.backendfortfolio.Dto.TrainingDto;
import backendportfolio.example.backendfortfolio.Dto.TrainingImagesDto;
import backendportfolio.example.backendfortfolio.model.Training;
import backendportfolio.example.backendfortfolio.model.TrainingImages;

import java.util.List;

public interface TrainingService {

    List<TrainingDto>getAllTraining();
    Training updateTraining(TrainingDto trainingDto,Long id);
    List<TrainingImagesDto>getAllTrainingimg();
    TrainingImages updateTrainingImg(TrainingImagesDto trainingImagesDto, Long id);

}
