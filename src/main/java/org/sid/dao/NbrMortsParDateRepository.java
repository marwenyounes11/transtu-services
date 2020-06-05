package org.sid.dao;


import org.sid.bi.entitie.NbrMortsParDate;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface NbrMortsParDateRepository extends CrudRepository<NbrMortsParDate,String>{

}
