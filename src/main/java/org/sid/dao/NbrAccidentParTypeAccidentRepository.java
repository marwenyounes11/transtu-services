package org.sid.dao;

import org.sid.bi.entitie.NbrAccidentParTypeAccident;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface NbrAccidentParTypeAccidentRepository extends CrudRepository<NbrAccidentParTypeAccident,String>{

}
