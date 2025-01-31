package org.example.organizationdiscovery.repository;

import org.example.organizationdiscovery.model.Organization;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface OrganizationRepository extends CrudRepository<Organization, String> {
    public Optional<Organization> findById(String org_id);
}
