package org.sid.dao;

import java.util.List;

import org.sid.dto.RecordDto;
import org.sid.entities.Record;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface RecordRepository extends JpaRepository<Record,Long>  {
	@Query("select r from Record r where r.descriptionRecord like :x")
	public Page<Record> chercherRecord(@Param("x")String mc,Pageable pageable);
	@Query("SELECT new org.sid.dto.RecordDto(r.id,r.descriptionRecord) "
			  +
			  "FROM Record r"
			  ) List<RecordDto> listRecord();

}
