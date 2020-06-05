package org.sid.dao;

import org.sid.bi.entitie.NbrAccidentParDistrict;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface NbrAccidentParDistrictRepository extends CrudRepository<NbrAccidentParDistrict,String>{

}
