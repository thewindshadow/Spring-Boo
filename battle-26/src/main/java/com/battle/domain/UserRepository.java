package com.battle.domain;

import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.jpa.repository.JpaRepository;


/**
 * Created by Bing.Z on 2017/3/7.
 */
@CacheConfig(cacheNames = "users")
public interface UserRepository  extends JpaRepository<User, Long> {

    @Cacheable(key = "#p0", condition = "#p0.length() < 10")
    User findByName(String name);
}
