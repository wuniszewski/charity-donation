package pl.coderslab.charity.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import pl.coderslab.charity.service.GenericService;

import java.util.List;

public abstract class GenericServiceImpl <T, R extends JpaRepository<T, Long>> implements GenericService<T> {
    protected R repository;

    @Autowired
    public GenericServiceImpl(R repository) {
        this.repository = repository;
    }
    @Override
    public T getById (Long id) {
        return this.repository.getOne(id);
    }
    @Override
    public List<T> findAll () {
        return this.repository.findAll();
    }
    @Override
    public boolean deleteById (Long id) {
        T entity = this.repository.getOne(id);
        if (entity != null) {
            this.repository.deleteById(id);
            return true;
        }
        return false;
    }
    @Override
    public T save (T element) {
        return this.repository.save(element);
    }

}
