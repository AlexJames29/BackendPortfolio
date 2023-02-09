package backendportfolio.example.backendfortfolio.controller;

import backendportfolio.example.backendfortfolio.Dto.FooterDto;
import backendportfolio.example.backendfortfolio.exception.PortfolioNotFoundException;
import backendportfolio.example.backendfortfolio.model.Footer;
import backendportfolio.example.backendfortfolio.service.FooterService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
//@CrossOrigin("http://localhost:3000")
@RequestMapping("/footers")
public class FooterController {
    @Autowired
    private ModelMapper modelMapper;
    @Autowired
    private FooterService footerService;

        @PutMapping("/footer/{id}")
    public ResponseEntity<FooterDto> editFooter(@PathVariable long id, @RequestBody FooterDto footerDto) {
        //convert DTO to entity
        Footer footerRequest = modelMapper.map(footerDto, Footer.class);
        Footer footer = footerService.editFooter(id, footerRequest);
        //entity to DTO
        FooterDto footerReponse = modelMapper.map(footer, FooterDto.class);
        return ResponseEntity.ok().body(footerReponse);
    }

    @GetMapping("/footer")
    public ResponseEntity<List<FooterDto>> getAllFooter() {
        List<FooterDto> footerDto = footerService.getAllFooter();
        return new ResponseEntity<>(footerDto, HttpStatus.OK);
    }


//    public List<Footer> getAllFooter() throws PortfolioNotFoundException {
//        return footerService.getFooter().stream().map(footer ->modelMapper.map(footer,Footer.class)).collect(Collectors.toList());
//    }


    @GetMapping("/footer/{id}")
    public ResponseEntity<FooterDto> getFooter(@PathVariable(name = "id") Long id) {
        Footer footer = footerService.getFooter(id);
        FooterDto footerResponse = modelMapper.map(footer, FooterDto.class);
        return ResponseEntity.ok().body(footerResponse);
    }

//    Footer updateFooter(@RequestBody Footer newFooter, @PathVariable Long id ){
//              return portfolioRepository.findById(id).map(footer-> {
//                  footer.setAboutme(newFooter.getAboutme());
//                  footer.setEmail(newFooter.getEmail());
//                  footer.setAddress(newFooter.getAddress());
//                  footer.setPhonenumber(newFooter.getPhonenumber());
//                  return portfolioRepository.save(footer);
//              }).orElseThrow(()-> new PortfolioNotFoundException(id));
//            }
}
