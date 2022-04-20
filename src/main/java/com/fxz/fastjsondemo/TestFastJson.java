package com.fxz.fastjsondemo;

import com.alibaba.fastjson.JSON;

/**
 * @author FangXiongzhi
 * CreateTime: 2022-04-20 21:05:34
 * Description：FastJson测试类
 */
public class TestFastJson {

    public static void main(String[] args) {
        Group group = new Group();
        group.setId(0L);
        group.setName("admin");

        User guestUser = new User();
        guestUser.setId(2L);
        guestUser.setName("guest");

        User rootUser = new User();
        rootUser.setId(3L);
        rootUser.setName("root");

        group.addUser(guestUser);
        group.addUser(rootUser);

        String jsonString = JSON.toJSONString(group);
        // 输出: jsonString = {"id":0,"name":"admin","users":[{"id":2,"name":"guest"},{"id":3,"name":"root"}]}
        System.out.println("jsonString = " + jsonString);

        String jsonString1 = "{\"id\":0,\"name\":\"admin\",\"users\":[{\"id\":2,\"name\":\"guest\"},{\"id\":3,\"name\":\"root\"}]}";
        Group group1 = JSON.parseObject(jsonString1, Group.class);
        // 输出：group1 = Group{id=0, name='admin', users=[User{id=2, name='guest'}, User{id=3, name='root'}]}
        System.out.println("group1 = " + group1);
    }

}
