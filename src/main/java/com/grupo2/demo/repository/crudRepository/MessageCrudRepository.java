package com.grupo2.demo.repository.crudRepository;

import com.grupo2.demo.entities.Message;
import org.springframework.data.repository.CrudRepository;

public interface MessageCrudRepository extends CrudRepository<Message, Integer> {

}