package model;

public abstract class XYZ {
    private int id;
    private String name;
    private String sex;

    public XYZ(int id, String name, String sex) {
        this.id = id;
        this.name = name;
        this.sex = sex;
    }

    public XYZ() {

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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "XYZ{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }
    public abstract String getInfo();
}
