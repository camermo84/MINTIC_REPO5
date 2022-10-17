package com.grupo2.demo.service;

import com.grupo2.demo.entities.Category;
import com.grupo2.demo.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;

    public List<Category> getAll(){
        return (List<Category>)categoryRepository.getAll();
    }

    public Optional<Category> getCategory(int id){
        return categoryRepository.getCategory(id);
    }

    public Category save(Category category){
        if (validarCampos(category)) {
            if (category.getId() == null) {
                return categoryRepository.save(category);
            } else {
                Optional<Category> categoryEncontrado = getCategory(category.getId());
                if (categoryEncontrado.isEmpty()) {
                    return categoryRepository.save(category);
                } else {
                    return category;
                }
            }
        }
        return category;
    }

    public boolean delete (int id){
        Boolean resultado = getCategory(id).map(elemento ->{
            categoryRepository.delete(elemento);
            return true;
        } ).orElse(false);
        return resultado;
    }

    public boolean validarCampos(Category category){
        return (category.getName().length()<=45 && category.getDescription().length()<=250);
    }


}
