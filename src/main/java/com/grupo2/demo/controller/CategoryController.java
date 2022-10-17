package com.grupo2.demo.controller;

import com.grupo2.demo.entities.Category;
import com.grupo2.demo.service.CategoryService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins="*",methods = {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE})
@RestController
@RequestMapping("api/Category")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;
    @GetMapping("/all")
    public List<Category> getAll(){
        return categoryService.getAll();
    }
    @GetMapping("/{id}")
    public Optional<Category> getCategory(@PathVariable("id") int id){
        return categoryService.getCategory(id);
    }
    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Category save(@RequestBody Category category){
        return categoryService.save(category);
    }
   // @PutMapping("/update")
    //@ResponseStatus(HttpStatus.CREATED)
   // public Category update(@RequestBody Category category){
      //  return categoryService.update(category);
    //}
    //@DeleteMapping("/{id}")
    //@ResponseStatus(HttpStatus.CREATED)
    //public boolean delete(@PathVariable("id") int id){
        //return categoryService.deleteCategory(id);
   // }

}

