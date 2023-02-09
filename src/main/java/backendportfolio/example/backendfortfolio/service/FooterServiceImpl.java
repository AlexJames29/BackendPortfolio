package backendportfolio.example.backendfortfolio.service;

import backendportfolio.example.backendfortfolio.Dto.FooterDto;
import backendportfolio.example.backendfortfolio.exception.PortfolioNotFoundException;
import backendportfolio.example.backendfortfolio.model.Footer;
import backendportfolio.example.backendfortfolio.repository.FooterRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FooterServiceImpl implements FooterService {
    @Autowired
    private FooterRepository footerRepository;
    @Autowired
    private ModelMapper modelMapper;

    @Override
    public Footer editFooter(long id, Footer footer) {
        Footer footer1 = footerRepository.findById(id).orElseThrow(() -> new PortfolioNotFoundException(id));
        footer1.setAboutme(footer.getAboutme());
        footer1.setEmail(footer.getEmail());
        footer1.setPhonenumber(footer.getPhonenumber());
        footer1.setAddress(footer.getAddress());
        footer1.setCity(footer.getCity());
        footer1.setSentenceaboutme(footer.getSentenceaboutme());
        return footerRepository.save(footer1);
    }


    @Override
    public List<FooterDto> getAllFooter() {
        List<Footer> footer = footerRepository.findAll();
        return footer.stream().map(data -> modelMapper.map(data, FooterDto.class)).toList();
    }

    @Override
    public Footer getFooter(long id) {
        Optional<Footer> result = footerRepository.findById(id);
        if (result.isPresent()) {
            return result.get();
        } else {
            throw new PortfolioNotFoundException(id);
        }
    }
}

//    @Override
//    public FooterDto getFooter() {
//        return footerRepository.findAll();
//    }

//    @Override
//    public Footer getFooter(long id) {
//        Optional<Footer> result = footerRepository.findById(id);
//        if(result.isPresent()){
//            return result.get();
//        }else {
//            throw new PortfolioNotFoundException(id);
//        }
//    }
//}
