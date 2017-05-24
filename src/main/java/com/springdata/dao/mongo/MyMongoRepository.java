package com.springdata.dao.mongo;

import javax.transaction.Transactional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.springdata.models.Users;

@Transactional
public interface MyMongoRepository extends MongoRepository<Users, String>{

}
