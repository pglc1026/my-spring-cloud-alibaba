package com.huan.study.cloud.alibaba.gateway.controller;

import com.huan.study.cloud.alibaba.gateway.handler.BizException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 用户控制器
 *
 * @author huan.fu 2021/8/31 - 下午4:50
 */
@RestController
@Slf4j
public class UserController {

    /**
     * 发生运行时异常
     */
    @GetMapping("showUserInfo")
    public void showUserInfo() {
        log.info("显示用户信息");
        int i = 1 / 0;
    }

    /**
     * 发生网关层自定义业务异常
     */
    @GetMapping("addUser")
    public void addUser() {
        log.info("添加用户");
        throw new BizException(1001);
    }

}
