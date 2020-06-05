package org.sid.dao;

import org.sid.bi.entitie.EstimationPrixDegatParDate;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface EstimationPrixDegatParDateRepository extends CrudRepository<EstimationPrixDegatParDate,String>{

}
