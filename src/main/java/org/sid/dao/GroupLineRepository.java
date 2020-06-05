package org.sid.dao;

import org.sid.entities.GroupLine;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface GroupLineRepository extends JpaRepository<GroupLine,Long>  {
	 
		@Query("select g from GroupLine g where g.nomGroupFR like :x")
		public Page<GroupLine> chercherGroupLine(@Param("x")String mc,Pageable pageable);



}
