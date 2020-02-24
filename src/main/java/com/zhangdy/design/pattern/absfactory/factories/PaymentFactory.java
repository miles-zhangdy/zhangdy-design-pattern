package com.zhangdy.design.pattern.absfactory.factories;

import com.zhangdy.design.pattern.absfactory.IPayment;

public interface PaymentFactory {

    IPayment getPayment();

}
