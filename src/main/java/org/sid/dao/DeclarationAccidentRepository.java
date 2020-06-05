package org.sid.dao;

import java.util.List;

import org.sid.dto.DeclarationAccidentDto;
import org.sid.entities.DeclarationAccident;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface DeclarationAccidentRepository extends JpaRepository<DeclarationAccident,Long>{
	
	 
}
