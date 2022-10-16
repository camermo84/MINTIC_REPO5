package com.grupo2.demo.repository.crudRepository;

import com.grupo2.demo.entities.Reservation;
import org.springframework.data.repository.CrudRepository;

public interface ReservationCrudRepository extends CrudRepository<Reservation, Integer> {

}