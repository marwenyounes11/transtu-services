package org.sid.dao;

import org.sid.bi.entitie.NbrAccidentParMoyenTransportDate;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface NbrAccidentParMoyenTransportDateRepository extends CrudRepository<NbrAccidentParMoyenTransportDate,String>{

}
