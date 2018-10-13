package cn.kgc.test;

import cn.kgc.entity.ClassRoom;
import cn.kgc.entity.Student;
import cn.kgc.utils.HibernateUtils;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;

/**
 * @ProjectName: testHibernate
 * @Package: cn.kgc.test
 * @ClassName: OrderDescTest
 * @Author: Xu.Xin
 * @Description: 学生类测试
 * @Date: 2018/10/12 9:35
 * @Version: 1.0
 */
public class StudentTest {
    @Test
    public void add() {
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
        Session session = HibernateUtils.openSession();

        Transaction transaction = session.beginTransaction();
        Student student = new Student(1, "xuXin", new ClassRoom(1, null));
        session.save(student);
        transaction.commit();

        session.close();


    }
    @Test
    public void query() {
        Session session = HibernateUtils.openSession();

        Transaction transaction = session.beginTransaction();
        Student student = (Student) session.get(Student.class,3);
        transaction.commit();

        System.out.println(student.getRoom().getName());
        session.close();

    }
}
