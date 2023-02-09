package backendportfolio.example.backendfortfolio.service;

import backendportfolio.example.backendfortfolio.Dto.TrainingDto;
import backendportfolio.example.backendfortfolio.Dto.TrainingImagesDto;
import backendportfolio.example.backendfortfolio.exception.PortfolioNotFoundException;
import backendportfolio.example.backendfortfolio.model.Training;
import backendportfolio.example.backendfortfolio.model.TrainingImages;
import backendportfolio.example.backendfortfolio.repository.TrainingImagesRepository;
import backendportfolio.example.backendfortfolio.repository.TrainingRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrainingImpl implements TrainingService {

    @Autowired
    private TrainingRepository trainingRepository;
    @Autowired
    private TrainingImagesRepository trainingImagesRepository;
    @Autowired
    private ModelMapper modelMapper;

    @Override
    public List<TrainingDto> getAllTraining() throws PortfolioNotFoundException {
        List<Training> trainingList = trainingRepository.findAll();
        return trainingList.stream().map(training -> modelMapper.map(training, TrainingDto.class)).toList();

    }

    @Override
    public Training updateTraining(TrainingDto trainingDto, Long id) {
        Training training = trainingRepository.findById(id).orElseThrow(()-> new PortfolioNotFoundException(id));
            training.setAbout(trainingDto.getAbout());
            training.setName(trainingDto.getName());
            training.setAbout(trainingDto.getAbout());

        return trainingRepository.save(training);
    }
    @Override
    public List<TrainingImagesDto> getAllTrainingimg() throws PortfolioNotFoundException {
        List<TrainingImages> trainingImagesList = trainingImagesRepository.findAll();
        return trainingImagesList.stream().map(trainingImg -> modelMapper.map(trainingImg, TrainingImagesDto.class)).toList();
    }
    @Override
    public TrainingImages updateTrainingImg(TrainingImagesDto trainingImagesDto, Long id) {
        TrainingImages trainingImages = trainingImagesRepository.findById(id).orElseThrow(()-> new PortfolioNotFoundException(id));
        trainingImages.setImages(trainingImagesDto.getImages());
        return trainingImagesRepository.save(trainingImages);
    }
}
