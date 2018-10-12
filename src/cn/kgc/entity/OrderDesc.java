package cn.kgc.entity;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @ProjectName: testHibernate
 * @Package: cn.kgc.entity
 * @ClassName: OrderDesc
 * @Author: Xu.Xin
 * @Description: 订单详情类
 * @Date: 2018/10/12 9:26
 * @Version: 1.0
 */
@Entity
@Table(name = "t_order_desc")
public class OrderDesc {
    private String name;
    private OrderDescPk pk;

    public OrderDesc() {
    }

    public OrderDesc(String name, OrderDescPk pk) {
        this.name = name;
        this.pk = pk;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @EmbeddedId
    public OrderDescPk getPk() {
        return pk;
    }

    public void setPk(OrderDescPk pk) {
        this.pk = pk;
    }

}
