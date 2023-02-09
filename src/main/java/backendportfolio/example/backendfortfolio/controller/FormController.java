package backendportfolio.example.backendfortfolio.controller;

import backendportfolio.example.backendfortfolio.Dto.FooterDto;
import backendportfolio.example.backendfortfolio.Dto.FormDto;
import backendportfolio.example.backendfortfolio.exception.PortfolioNotFoundException;
import backendportfolio.example.backendfortfolio.model.Form;
import backendportfolio.example.backendfortfolio.service.FormService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/forms")
public class FormController {
    @Autowired
    private FormService formService;

    @GetMapping("/form")
    public ResponseEntity<List<FormDto>> getForms()throws PortfolioNotFoundException{
        List<FormDto> formDtoList= formService.getAllForm();
        return new ResponseEntity<>(formDtoList, HttpStatus.OK);
    }
    @PutMapping("/{id}")
    public ResponseEntity<Form> update(@RequestBody FormDto formDto,@PathVariable long id ) throws PortfolioNotFoundException{
        return new ResponseEntity<>(formService.updateForm(formDto,id),HttpStatus.OK);
    }

}
