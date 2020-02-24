package com.zhangdy.design.pattern.absfactory.domenstic;

import com.zhangdy.design.pattern.absfactory.Deduction;

import java.util.UUID;

public class UnipayPayment  extends Deduction {


    @Override
    public String pay() {
        return "unipay_" + UUID.randomUUID().toString();
    }
}