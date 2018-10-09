import cn.kgc.entity.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.junit.Test;

/**
 * @author 79330
 */
public class UserTest {
    @Test
    public void add() {
        Configuration cfg = new Configuration().configure();

        ServiceRegistry registry = new StandardServiceRegistryBuilder().applySettings(cfg.getProperties()).build();

        SessionFactory sessionFactory = cfg.buildSessionFactory(registry);

        Session session = sessionFactory.openSession();

        Transaction transaction = session.beginTransaction();

        User user = new User();

        user.setName("123");

        session.save(user);

        transaction.commit();

        session.close();
    }
}
