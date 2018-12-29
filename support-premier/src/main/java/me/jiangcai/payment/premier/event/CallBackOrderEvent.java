package me.jiangcai.payment.premier.event;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * 在异步回调中订单交易成功时的时间
 *
 * @author lxf
 */
@Data
@AllArgsConstructor
public class CallBackOrderEvent {
    /**
     * payOrderId
     */
    private String platformId;
    private boolean success;
}