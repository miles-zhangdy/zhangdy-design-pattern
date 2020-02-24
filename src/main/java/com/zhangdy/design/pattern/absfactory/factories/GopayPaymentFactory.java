package com.zhangdy.design.pattern.absfactory.factories;

import com.zhangdy.design.pattern.absfactory.IPayment;
import com.zhangdy.design.pattern.absfactory.abroad.GopayPayment;
import com.zhangdy.design.pattern.absfactory.domenstic.WepayPayment;

public class GopayPaymentFactory implements PaymentFactory {

    @Override
    public IPayment getPayment() {
        return new GopayPayment();
    }
}
