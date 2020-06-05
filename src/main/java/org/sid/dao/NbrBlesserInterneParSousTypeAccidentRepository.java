package org.sid.dao;

import org.sid.bi.entitie.NbrBlesserInterneParSousTypeAccident;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface NbrBlesserInterneParSousTypeAccidentRepository extends CrudRepository<NbrBlesserInterneParSousTypeAccident,String> {

}
