package com.grupo2.demo.repository.crudRepository;

import com.grupo2.demo.entities.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryCrudRepository extends CrudRepository<Category, Integer> {

}
