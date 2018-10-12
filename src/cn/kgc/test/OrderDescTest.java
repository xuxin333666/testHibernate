package cn.kgc.test;

import cn.kgc.entity.OrderDesc;
import cn.kgc.entity.OrderDescPk;
import cn.kgc.utils.HibernateUtils;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;

/**
 * @ProjectName: testHibernate
 * @Package: cn.kgc.test
 * @ClassName: OrderDescTest
 * @Author: Xu.Xin
 * @Description: 订单详情类测试
 * @Date: 2018/10/12 9:35
 * @Version: 1.0
 */
public class OrderDescTest {
    @Test
    /**
     * @Method add
     * @Author Xu.Xin
     * @Version  1.0
     * @Description
     * @param
     * @Return void
     * @Exception
     * @Date 2018/10/12 9:35
     */
    public void add() {
        Session session = HibernateUtils.openSession();

        Transaction transaction = session.beginTransaction();
        OrderDescPk orderDescPk = new OrderDescPk(2, 1);
        OrderDesc orderDesc = new OrderDesc("xuXin",orderDescPk);

        session.save(orderDesc);

        transaction.commit();

        session.close();


    }
}
