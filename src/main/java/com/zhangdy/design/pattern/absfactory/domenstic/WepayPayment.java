package com.zhangdy.design.pattern.absfactory.domenstic;

import com.zhangdy.design.pattern.absfactory.Deduction;

import java.util.UUID;

public class WepayPayment  extends Deduction {


    @Override
    public String pay() {
        return "wepay_" + UUID.randomUUID().toString();
    }
}