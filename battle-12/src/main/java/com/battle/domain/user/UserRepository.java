package com.battle.domain.user;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Bing.Z on 2017/3/1.
 */
public interface UserRepository extends JpaRepository<User,Long> {
}
