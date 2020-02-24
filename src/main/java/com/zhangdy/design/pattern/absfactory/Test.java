package com.zhangdy.design.pattern.absfactory;

import com.zhangdy.design.pattern.absfactory.factories.AlipayPaymentFactory;
import com.zhangdy.design.pattern.absfactory.factories.GopayPaymentFactory;
import com.zhangdy.design.pattern.absfactory.factories.UnipayPaymentFactory;
import com.zhangdy.design.pattern.absfactory.factories.WepayPaymentFactory;

public class Test {

    public static void main(String[] args) {
        AlipayPaymentFactory alipayPaymentFactory = new AlipayPaymentFactory();
        IPayment payment = alipayPaymentFactory.getPayment();
        System.out.println("支付宝工厂 扣款流水号 ： " + payment.pay());

        GopayPaymentFactory gopayPaymentFactory = new GopayPaymentFactory();
        IPayment gopayment = gopayPaymentFactory.getPayment();
        System.out.println("境外工厂 扣款流水号 ： " + gopayment.pay());

        UnipayPaymentFactory unipayPaymentFactory = new UnipayPaymentFactory();
        IPayment unipayment = unipayPaymentFactory.getPayment();
        System.out.println("银联工厂 扣款流水号 ： " + unipayment.pay());


        WepayPaymentFactory wepayPaymentFactory = new WepayPaymentFactory();
        IPayment wepayPaymentFactoryPayment = wepayPaymentFactory.getPayment();
        System.out.println("微信工厂 扣款流水号 ： " + wepayPaymentFactoryPayment.pay());








    }

}
