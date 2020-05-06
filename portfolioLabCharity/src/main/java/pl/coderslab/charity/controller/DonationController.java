package pl.coderslab.charity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import pl.coderslab.charity.entity.Donation;

@Controller
public class DonationController {

    @GetMapping("/addDonation")
    public String showCreateDonationForm (Model model) {
        model.addAttribute("donation", new Donation());
        return "form";
    }
}
