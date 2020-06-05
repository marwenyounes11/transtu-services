package org.sid.services;

import java.util.List;
import java.util.Optional;

import org.sid.dto.RecordDto;
import org.sid.entities.Record;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

public interface RecordService {
	Record saveRecord(RecordDto r);
	
	Record updateRecord(Long id,RecordDto r);
	
	List<Record> fetchListRecord();

	Optional<Record> findById(Long id);

	Page<Record> chercherRecord(String string, PageRequest of);

	void deleteById(Long id);
}
