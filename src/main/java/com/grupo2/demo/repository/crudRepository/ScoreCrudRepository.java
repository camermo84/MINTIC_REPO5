package com.grupo2.demo.repository.crudRepository;

import com.grupo2.demo.entities.Score;
import org.springframework.data.repository.CrudRepository;

public interface ScoreCrudRepository  extends CrudRepository<Score, Integer> {
}
