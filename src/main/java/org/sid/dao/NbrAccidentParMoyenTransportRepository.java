package org.sid.dao;

import org.sid.bi.entitie.NbrAccidentParMoyenTransport;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface NbrAccidentParMoyenTransportRepository extends CrudRepository<NbrAccidentParMoyenTransport,String>{

}
