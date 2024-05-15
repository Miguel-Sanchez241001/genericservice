package com.wgeneric.microservices.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wgeneric.microservices.models.entidades.Plantilla;

 @Repository
public interface PlantillaRepo extends JpaRepository<Plantilla, Integer> {

}
