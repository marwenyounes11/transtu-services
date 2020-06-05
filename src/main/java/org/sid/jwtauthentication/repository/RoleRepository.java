
  package org.sid.jwtauthentication.repository;
  
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import org.sid.jwtauthentication.model.Role;
import org.sid.jwtauthentication.model.RoleName;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(RoleName roleName);
    
    @Query("select r from Role r where r.name like :x")
	public Page<Role> chercherRole(@Param("x")String mc,Pageable pageable);
}
