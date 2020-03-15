package com.zhangdy.design.pattern.strategy.handler;

import com.zhangdy.design.pattern.strategy.dto.RechargeAddressDTO;

import java.util.UUID;

public class EtcRechargeHandler extends  AbstractRechargeHandler{


    @Override
    public RechargeAddressDTO generateRechargeAddress() {
        return RechargeAddressDTO.builder()
                .address(UUID.randomUUID().toString())
                .currency("ETC")
                .build();
    }
}
