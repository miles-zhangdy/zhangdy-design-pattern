package com.zhangdy.design.pattern.absfactory.abroad;

import com.zhangdy.design.pattern.absfactory.Deduction;

import java.util.UUID;

public class GopayPayment extends Deduction {


    @Override
    public String pay() {
        return "gopay_" + UUID.randomUUID().toString();
    }
}
