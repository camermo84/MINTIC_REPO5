package com.grupo2.demo.repository.crudRepository;

import com.grupo2.demo.entities.Client;
import org.springframework.data.repository.CrudRepository;

public interface ClientCrudRepository extends CrudRepository<Client, Integer> {

}