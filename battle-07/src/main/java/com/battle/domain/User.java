package com.battle.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Created by Bing.Z on 2017/2/24.
 */
@ApiModel(value = "用户",description = "user")
public class User {
    @ApiModelProperty(value = "用户id", required = true)
    private Long id;
    @ApiModelProperty(value="用户名",required = true)
    private String name;
    @ApiModelProperty(value="年龄")
    private Integer age;
    public User() {
    }

    public User(Long id, String name, Integer age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
