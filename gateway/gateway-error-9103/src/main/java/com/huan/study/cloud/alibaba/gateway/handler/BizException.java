package com.huan.study.cloud.alibaba.gateway.handler;

import lombok.Getter;

/**
 * 业务异常
 *
 * @author huan.fu 2021/8/31 - 下午4:49
 */
@Getter
public class BizException extends RuntimeException {
    /**
     * 业务上自定义的错误码
     */
    private final int errorCode;

    public BizException(int errorCode) {
        this.errorCode = errorCode;
    }
}
