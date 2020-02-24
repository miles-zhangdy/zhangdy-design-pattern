package com.zhangdy.design.pattern.absfactory.factories;

import com.zhangdy.design.pattern.absfactory.IPayment;
import com.zhangdy.design.pattern.absfactory.domenstic.UnipayPayment;

public class UnipayPaymentFactory implements PaymentFactory {

    @Override
    public IPayment getPayment() {
        return new UnipayPayment();
    }
}
