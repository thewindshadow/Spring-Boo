package com.battle.service;

/**
 * Created by Bing.Z on 2017/2/28.
 */
public interface UserService {

    /**
     * 创建
     */
    public void create(String name,Integer age);

    /**
     * 删除
     */
    public void deleteByName(String name);

    /**
     * 获取用户总数
     * @return
     */
    public Integer getAllUser();

    /**
     * 删除所有用户
     */
    public void deleteAllUser();

    /**
     * 修改用户信息
     */
    public void update(String name,Integer age);

}
