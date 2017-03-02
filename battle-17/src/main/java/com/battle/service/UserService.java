package com.battle.service;

import com.battle.domain.User;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Bing.Z on 2017/3/2.
 */
public interface UserService {

    @Transactional(isolation = Isolation.DEFAULT, propagation = Propagation.REQUIRED)
    User login(String name, String password);

}
