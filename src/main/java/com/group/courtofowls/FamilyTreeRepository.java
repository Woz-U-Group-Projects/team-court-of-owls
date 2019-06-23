package com.group.courtofowls;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.group.courtofowls.models.personalInfo;

public interface FamilyTreeRepository extends MongoRepository<personalInfo, String> {

}
