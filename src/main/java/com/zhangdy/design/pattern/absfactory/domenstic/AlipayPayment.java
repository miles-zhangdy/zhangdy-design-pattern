package com.zhangdy.design.pattern.absfactory.domenstic;

import com.zhangdy.design.pattern.absfactory.Deduction;

import java.util.UUID;

public class AlipayPayment extends Deduction {


    @Override
    public String pay() {
        return "alipay_" + UUID.randomUUID().toString();
    }
}
