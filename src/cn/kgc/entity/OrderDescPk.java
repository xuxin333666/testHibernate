package cn.kgc.entity;

import java.io.Serializable;

/**
 * @ProjectName: testHibernate
 * @Package: cn.kgc.entity
 * @ClassName: OrderDescPk
 * @Author: Xu.Xin
 * @Description: 订单详情主键类
 * @Date: 2018/10/12 9:26
 * @Version: 1.0
 */
public class OrderDescPk implements Serializable {
    private int orderId;
    private int goodsId;

    public OrderDescPk() {
    }

    public OrderDescPk(int orderId, int goodsId) {
        this.orderId = orderId;
        this.goodsId = goodsId;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(int goodsId) {
        this.goodsId = goodsId;
    }
}
