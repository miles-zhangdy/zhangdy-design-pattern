package com.zhangdy.design.pattern.strategy.handler;


import com.zhangdy.design.pattern.strategy.dto.RechargeAddressDTO;

public abstract class AbstractRechargeHandler {

    /**
     * 生成充币地址
     * @return
     */
    abstract public RechargeAddressDTO generateRechargeAddress();


}
