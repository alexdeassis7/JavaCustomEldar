package ar.com.eldar.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import ar.com.eldar.models.Bike;

//https://stackoverflow.com/questions/14014086/what-is-difference-between-crudrepository-and-jparepository-interfaces-in-spring
public interface BikeRepository extends JpaRepository<Bike, Long> {
}
