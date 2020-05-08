package pl.coderslab.charity.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import pl.coderslab.charity.entity.Category;
import pl.coderslab.charity.service.impl.CategoryServiceImpl;

@Controller
public class CategoryController {
    private CategoryServiceImpl categoryService;

    @Autowired
    public CategoryController(CategoryServiceImpl categoryService) {
        this.categoryService = categoryService;
    }

    @GetMapping("/add4categories")
    public void createCategories () {
        Category cat1 = new Category();
        Category cat2 = new Category();
        Category cat3 = new Category();
        Category cat4 = new Category();
        cat1.setName("ubrania, które nadają się do ponownego użycia");
        cat2.setName("ubrania, do wyrzucenia");
        cat3.setName("zabawki");
        cat4.setName("książki");
        categoryService.save(cat1);
        categoryService.save(cat2);
        categoryService.save(cat3);
        categoryService.save(cat4);
    }
}
