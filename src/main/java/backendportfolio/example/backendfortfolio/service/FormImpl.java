package backendportfolio.example.backendfortfolio.service;

import backendportfolio.example.backendfortfolio.Dto.FormDto;
import backendportfolio.example.backendfortfolio.exception.PortfolioNotFoundException;
import backendportfolio.example.backendfortfolio.model.Form;
import backendportfolio.example.backendfortfolio.repository.FormRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FormImpl implements FormService {

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private FormRepository formRepository;

    @Override
    public List<FormDto> getAllForm() throws PortfolioNotFoundException{
        List<Form> formDtoList= formRepository.findAll();
     return  formDtoList.stream().map(form -> modelMapper.map(form,FormDto.class)).toList();
    }

    @Override
    public Form updateForm(FormDto formDto, Long id) {
        Form form = formRepository.findById(id).orElseThrow(() -> new PortfolioNotFoundException(id));
        form.setName(formDto.getName());
        form.setEmail(formDto.getEmail());
        form.setLastname(formDto.getLastname());
        form.setNumber(formDto.getNumber());
        form.setSubmit(formDto.getSubmit());
        form.setDetails(formDto.getDetails());
        modelMapper.map(formDto,form);
        return formRepository.save(form);
    }


}
