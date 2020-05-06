package pl.coderslab.charity.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.coderslab.charity.entity.Institution;
import pl.coderslab.charity.service.impl.InstitutionServiceImpl;

@Controller
@RequestMapping("/institution")
public class InstitutionController {
    private InstitutionServiceImpl institutionService;
    @Autowired
    public InstitutionController(InstitutionServiceImpl institutionService) {
        this.institutionService = institutionService;
    }
    @GetMapping("/create4")
    public void create4Institutions () {
        Institution institution1 = new Institution();
        Institution institution2 = new Institution();
        Institution institution3 = new Institution();
        Institution institution4 = new Institution();
        institution1.setName("Dbam o zdrowie");
        institution1.setDescription("Pomoc dzieciom z ubogich rodzin");
        institution2.setName("A kogo");
        institution2.setDescription("Pomoc wybudzaniu dzieci ze śpiączki");
        institution3.setName("Dla dzieci");
        institution3.setDescription("Pomoc osobom znajdującym się w trudnej sytuacji życiowej");
        institution4.setName("Bez domu");
        institution4.setDescription("Pomoc dla osób nie posiadających miejsca zamieszkania");
        institutionService.save(institution1);
        institutionService.save(institution2);
        institutionService.save(institution3);
        institutionService.save(institution4);
    }
}
