package pl.coderslab.charity.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.coderslab.charity.entity.Category;
import pl.coderslab.charity.repository.CategoryRepository;
import pl.coderslab.charity.service.CategoryService;

@Service
public class CategoryServiceImpl extends GenericServiceImpl<Category, CategoryRepository>  implements CategoryService {

    @Autowired
    public CategoryServiceImpl(CategoryRepository repository) {
        super(repository);
    }
}
