package com.zhangdy.design.pattern.strategy.client;

import com.zhangdy.design.pattern.strategy.context.RechargeHandlerContext;
import com.zhangdy.design.pattern.strategy.handler.AbstractRechargeHandler;
import com.zhangdy.design.pattern.strategy.handler.BtcRechargeHandler;
import com.zhangdy.design.pattern.strategy.handler.EtcRechargeHandler;
import com.zhangdy.design.pattern.strategy.handler.EthRechargeHandler;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class RechargeFactory {


    public static RechargeHandlerContext context = null;
    static {
        Map<String, AbstractRechargeHandler> map = new ConcurrentHashMap<>();
        map.put("BTC", new BtcRechargeHandler());
        map.put("ETC", new EtcRechargeHandler());
        map.put("ETH", new EthRechargeHandler());
        context = new RechargeHandlerContext(map);
    }

    public static AbstractRechargeHandler getHandler(String currency){
        return context.getInstance(currency);
    }

}
