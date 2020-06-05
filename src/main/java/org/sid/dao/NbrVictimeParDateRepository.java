package org.sid.dao;


import org.sid.bi.entitie.NbrVictimeParDate;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface NbrVictimeParDateRepository extends CrudRepository<NbrVictimeParDate,String> {

}
