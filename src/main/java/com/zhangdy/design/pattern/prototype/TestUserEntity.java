package com.zhangdy.design.pattern.prototype;


import com.alibaba.fastjson.JSON;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TestUserEntity implements Cloneable
{

    private Long id;
    private String name;

    @Override
    public String toString() {
        return "TestUserEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    protected TestUserEntity clone() throws CloneNotSupportedException {

        return JSON.parseObject(JSON.toJSONString(this), TestUserEntity.class);
    }
}
