package com.zhangdy.design.pattern.strategy.client;

import com.alibaba.fastjson.JSON;
import com.zhangdy.design.pattern.strategy.handler.AbstractRechargeHandler;

public class Test {


    public static void main(String[] args) {
        AbstractRechargeHandler btc = RechargeFactory.getHandler("BTC");
        System.out.println(JSON.toJSONString(btc.generateRechargeAddress()));
        AbstractRechargeHandler eth = RechargeFactory.getHandler("ETH");
        System.out.println(JSON.toJSONString(eth.generateRechargeAddress()));
        AbstractRechargeHandler etc = RechargeFactory.getHandler("ETC");
        System.out.println(JSON.toJSONString(etc.generateRechargeAddress()));

        // not found handler
        AbstractRechargeHandler ltc = RechargeFactory.getHandler("LTC");

    }

}
