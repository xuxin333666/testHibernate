package cn.kgc.utils;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

/**
 * @ProjectName: testHibernate
 * @Package: cn.kgc.utils
 * @ClassName: HibernateUtils
 * @Author: Xu.Xin
 * @Description: hibernate工具类
 * @Date: 2018/10/12 9:32
 * @Version: 1.0
 */
public class HibernateUtils {

    public static Session openSession() {
        Configuration cfg = new Configuration().configure();

        ServiceRegistry registry = new StandardServiceRegistryBuilder().applySettings(cfg.getProperties()).build();

        SessionFactory sessionFactory = cfg.buildSessionFactory(registry);

        return sessionFactory.openSession();
    }
}
