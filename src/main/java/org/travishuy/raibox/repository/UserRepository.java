package org.travishuy.raibox.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import org.travishuy.raibox.model.User;

@Repository
public interface UserRepository extends MongoRepository<User,String> {

}
