package org.sid.dao;


import org.sid.bi.entitie.NbrBlesserExterneParSousTypeAccident;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface NbrBlesserExterneParSousTypeAccidentRepository extends CrudRepository<NbrBlesserExterneParSousTypeAccident,String>{

}
