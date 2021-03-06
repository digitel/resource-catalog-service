package org.tmf.openapi.resource.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.stereotype.Repository;
import org.tmf.openapi.resource.domain.PhysicalResourceSpecification;


@Repository
public interface PhysicalResourceSpecificationRespository
		extends MongoRepository<PhysicalResourceSpecification, String>, QuerydslPredicateExecutor<PhysicalResourceSpecification> {

}
