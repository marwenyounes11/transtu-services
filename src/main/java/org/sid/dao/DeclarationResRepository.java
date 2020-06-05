package org.sid.dao;

import java.util.List;

import org.sid.dto.DeclarationResponsableDto;
import org.sid.entities.DeclarationRes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface DeclarationResRepository extends JpaRepository<DeclarationRes,Long>{
	 
}
