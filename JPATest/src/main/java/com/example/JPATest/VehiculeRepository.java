/**
 * 
 */
package com.example.JPATest;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

/**
 * @author alrib
 *
 */


public interface VehiculeRepository extends CrudRepository<Vehicule, Long> {
	
	List<Vehicule> findByName(String name);
	
	
}