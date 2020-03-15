package com.zhangdy.design.pattern.strategy.context;


import com.zhangdy.design.pattern.strategy.handler.AbstractRechargeHandler;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class RechargeHandlerContext {


    private Map<String, AbstractRechargeHandler> handlerMap;

    public RechargeHandlerContext(Map<String, AbstractRechargeHandler> handlerMap) {
        this.handlerMap = handlerMap;
    }

    public AbstractRechargeHandler getInstance(String type) {
        AbstractRechargeHandler handler = handlerMap.get(type);
        if (handler == null) {
            throw new RuntimeException("not found handler for type : " + type);
        }
        return handler;
    }





}

