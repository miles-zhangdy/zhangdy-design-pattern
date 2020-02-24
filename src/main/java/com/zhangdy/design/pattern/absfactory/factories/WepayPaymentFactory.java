package com.zhangdy.design.pattern.absfactory.factories;

import com.zhangdy.design.pattern.absfactory.IPayment;
import com.zhangdy.design.pattern.absfactory.domenstic.AlipayPayment;
import com.zhangdy.design.pattern.absfactory.domenstic.WepayPayment;

public class WepayPaymentFactory implements PaymentFactory {

    @Override
    public IPayment getPayment() {
        return new WepayPayment();
    }
}
