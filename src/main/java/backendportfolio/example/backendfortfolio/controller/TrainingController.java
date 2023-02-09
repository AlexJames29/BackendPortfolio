package backendportfolio.example.backendfortfolio.controller;

import backendportfolio.example.backendfortfolio.Dto.TrainingDto;
import backendportfolio.example.backendfortfolio.Dto.TrainingImagesDto;
import backendportfolio.example.backendfortfolio.exception.PortfolioNotFoundException;
import backendportfolio.example.backendfortfolio.model.Training;
import backendportfolio.example.backendfortfolio.model.TrainingImages;
import backendportfolio.example.backendfortfolio.service.TrainingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/trainings")
public class TrainingController {

    @Autowired
    private TrainingService trainingService;

    @GetMapping("/training")
    public ResponseEntity<List<TrainingDto>> getAllTraining() throws PortfolioNotFoundException {
        List<TrainingDto> trainingDtoList = trainingService.getAllTraining();
        return new ResponseEntity<>(trainingDtoList, HttpStatus.OK);
    }

    @PutMapping("/train/{id}")
    public ResponseEntity<Training> update(@RequestBody TrainingDto trainingDto, @PathVariable Long id) throws PortfolioNotFoundException {
        return new ResponseEntity<>(trainingService.updateTraining(trainingDto, id), HttpStatus.ACCEPTED);
    }

    @GetMapping("/trainingImg")
    public ResponseEntity<List<TrainingImagesDto>> getAllTrainingImg() throws PortfolioNotFoundException {
        List<TrainingImagesDto> trainingImagesDtoList = trainingService.getAllTrainingimg();
        return new ResponseEntity<>(trainingImagesDtoList, HttpStatus.OK);
    }

    @PutMapping("/img/{id}")
    public ResponseEntity<TrainingImages> update(@RequestBody TrainingImagesDto trainingImagesDto, @PathVariable Long id) throws PortfolioNotFoundException {
        return new ResponseEntity<>(trainingService.updateTrainingImg(trainingImagesDto, id), HttpStatus.ACCEPTED);
    }

}
