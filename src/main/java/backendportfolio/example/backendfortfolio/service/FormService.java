package backendportfolio.example.backendfortfolio.service;

import backendportfolio.example.backendfortfolio.Dto.FormDto;
import backendportfolio.example.backendfortfolio.model.Form;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface FormService {
    List<FormDto> getAllForm();
    Form updateForm(FormDto formDto, Long id);
}
