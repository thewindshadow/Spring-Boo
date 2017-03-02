package com.battle.domain;

import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by Bing.Z on 2017/3/1.
 */
public interface UserRepository extends MongoRepository<User,Long> {

    User findByUsername(String username);

}
