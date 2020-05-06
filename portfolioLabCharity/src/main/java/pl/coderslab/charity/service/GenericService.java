package pl.coderslab.charity.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface GenericService<T> {
    T getById (Long id);
    List<T> findAll ();
    boolean deleteById (Long id);
    T save (T element);
}
