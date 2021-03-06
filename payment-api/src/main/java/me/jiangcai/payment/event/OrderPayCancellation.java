package me.jiangcai.payment.event;

import me.jiangcai.payment.PayableOrder;
import me.jiangcai.payment.entity.PayOrder;

/**
 * 订单支付取消事件
 *
 * @author CJ
 */
public class OrderPayCancellation extends PaymentEvent{
    /**
     * @param payableOrder 统一事务内需支付商城订单
     * @param payOrder     统一事务内的支付订单
     */
    public OrderPayCancellation(PayableOrder payableOrder, PayOrder payOrder) {
        super(payableOrder, payOrder);
    }
}
