package backendportfolio.example.backendfortfolio.service;

import backendportfolio.example.backendfortfolio.Dto.FooterDto;
import backendportfolio.example.backendfortfolio.model.Footer;

import java.util.List;

public interface FooterService {
    Footer editFooter(long id, Footer footer);
    List<FooterDto> getAllFooter();
    Footer getFooter(long id);

    //    Footer getFooter(long id);

}
