package pl.coderslab.charity.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.coderslab.charity.service.impl.DonationServiceImpl;
import pl.coderslab.charity.service.impl.InstitutionServiceImpl;



@Controller
public class HomeController {

    private InstitutionServiceImpl institutionService;
    private DonationServiceImpl donationService;

    @Autowired
    public HomeController(InstitutionServiceImpl institutionService, DonationServiceImpl donationService) {
        this.institutionService = institutionService;
        this.donationService = donationService;
    }

    @RequestMapping("/")
    public String homeAction(Model model){
        model.addAttribute("institutions", institutionService.findAll());
        model.addAttribute("bagsQuantity", donationService.getQuantityOfDonatedBags());
        model.addAttribute("donationsQuantity", donationService.getQuantityOfDonations());
        return "index";
    }
}
