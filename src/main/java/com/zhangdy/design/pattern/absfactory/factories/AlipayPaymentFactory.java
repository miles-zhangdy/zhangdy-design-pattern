package com.zhangdy.design.pattern.absfactory.factories;

import com.zhangdy.design.pattern.absfactory.IPayment;
import com.zhangdy.design.pattern.absfactory.domenstic.AlipayPayment;

public class AlipayPaymentFactory implements PaymentFactory {

    @Override
    public IPayment getPayment() {
        return new AlipayPayment();
    }
}
