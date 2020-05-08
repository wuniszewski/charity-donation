package pl.coderslab.charity.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import pl.coderslab.charity.entity.Category;
import pl.coderslab.charity.entity.Donation;
import pl.coderslab.charity.entity.Institution;
import pl.coderslab.charity.service.impl.CategoryServiceImpl;
import pl.coderslab.charity.service.impl.InstitutionServiceImpl;

import java.util.List;

@Controller
public class DonationController {
    private CategoryServiceImpl categoryService;
    private InstitutionServiceImpl institutionService;

    @Autowired
    public DonationController(CategoryServiceImpl categoryService, InstitutionServiceImpl institutionService) {
        this.categoryService = categoryService;
        this.institutionService = institutionService;
    }

    @GetMapping("/addDonation")
    public String showCreateDonationForm (Model model) {
        model.addAttribute("donation", new Donation());
        return "form";
    }

    @ModelAttribute(name = "categories")
    public List<Category> getAllCategories () {
        return categoryService.findAll();
    }
    @ModelAttribute(name = "institutions")
    public List<Institution> getAllInstitutions () {
        return institutionService.findAll();
    }
}
