package org.sid.dao;


import org.sid.bi.entitie.NbrAccidentParDate;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface NbrAccidentParDateRepository extends CrudRepository<NbrAccidentParDate,String>{

}
