package org.sid.dao;

import java.util.List;

import org.sid.dto.SourceInfoDto;
import org.sid.entities.SourceInfo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface SourceInfoRepository extends JpaRepository<SourceInfo,Long> {
	@Query("select s from SourceInfo s where s.nameInfo like :x")
	public Page<SourceInfo> chercherSourceInfo(@Param("x")String mc,Pageable pageable);
	
	 @Query("SELECT new org.sid.dto.SourceInfoDto(s.id,s.nameInfo,s.lastNameInfo,s.natureInfo,s.phoneInfo) "
			  +
			  "FROM SourceInfo s"
			  ) List<SourceInfoDto> listSourceInfo();
}
