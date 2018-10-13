package cn.kgc.entity;

/**
 * @ProjectName: testHibernate
 * @Package: cn.kgc.entity
 * @ClassName: ClassRoom
 * @Author: Xu.Xin
 * @Description: 班级类
 * @Date: 2018/10/13 10:15
 * @Version: 1.0
 */
public class ClassRoom {
    private int id;
    private String name;

    public ClassRoom() {
    }

    public ClassRoom(int id, String name) {
        this.id = id;
        this.name = name;
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
}
