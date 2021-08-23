package com.huan.study.user.controller;

import com.google.common.collect.Lists;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author huan.fu 2021/8/23 - 下午5:58
 */
@RestController
public class UserController {

    private final List<String> users = Lists.newCopyOnWriteArrayList();

    @GetMapping("addUser")
    public String addUser(@RequestParam("userName") String userName) {
        this.users.add(userName);
        return "添加用户:[" + userName + "]成功.";
    }

    @GetMapping("findAllUsers")
    public List<String> findAllUsers() {
        return this.users;
    }
}
