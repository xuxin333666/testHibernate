package cn.kgc.entity;

/**
 * @ProjectName: testHibernate
 * @Package: cn.kgc.entity
 * @ClassName: Student
 * @Author: Xu.Xin
 * @Description: 学生类
 * @Date: 2018/10/13 10:15
 * @Version: 1.0
 */
public class Student {
    private int id;
    private String name;
    private ClassRoom room;

    public Student(int id, String name, ClassRoom room) {
        this.id = id;
        this.name = name;
        this.room = room;
    }

    public Student() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ClassRoom getRoom() {
        return room;
    }

    public void setRoom(ClassRoom room) {
        this.room = room;
    }
}
