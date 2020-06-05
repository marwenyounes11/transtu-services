package org.sid.dao;


import org.sid.entities.District;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface DistrictRepository extends JpaRepository<District, Long>{
	@Query("select d from District d where d.nameDistrict like :x")
	public Page<District> chercherDistrict(@Param("x") String mc, Pageable pageable);
}
