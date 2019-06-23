package com.group.courtofowls;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface FamilyTreeRepository extends MongoRepository<personalInfo, String> {

}
