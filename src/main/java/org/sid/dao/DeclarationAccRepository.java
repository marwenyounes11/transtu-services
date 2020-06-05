package org.sid.dao;

import java.util.List;

import org.sid.dto.DeclarationAccidentDto;
import org.sid.entities.DeclarationAcc;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface DeclarationAccRepository extends JpaRepository<DeclarationAcc,Long>{
	
	 
}
