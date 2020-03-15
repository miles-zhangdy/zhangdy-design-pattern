package com.zhangdy.design.pattern.strategy.handler;

import com.zhangdy.design.pattern.strategy.dto.RechargeAddressDTO;
import lombok.extern.slf4j.Slf4j;

import java.util.UUID;

public class BtcRechargeHandler extends  AbstractRechargeHandler{


    @Override
    public RechargeAddressDTO generateRechargeAddress() {
        return RechargeAddressDTO.builder()
                .address(UUID.randomUUID().toString())
                .currency("BTC")
                .build();
    }
}
