package org.sid.dao;

import org.sid.bi.entitie.EstimationPrixDegatParSousTypeAccident;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface EstimationPrixDegatParSousTypeAccidentRepository extends CrudRepository<EstimationPrixDegatParSousTypeAccident,String>{

}
