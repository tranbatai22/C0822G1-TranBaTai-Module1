package model;

public class BenhNhan extends XYZ{
    private String date;
    private String vip;

    public BenhNhan() {
    }

    public BenhNhan(int id, String name, String sex, String date, String vip) {
        super(id, name, sex);
        this.date = date;
        this.vip = vip;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getVip() {
        return vip;
    }

    public void setVip(String vip) {
        this.vip = vip;
    }

    @Override
    public String toString() {
        return "BenhNhan{" +
                "date='" + date + '\'' +
                ", vip='" + vip + '\'' +
                '}'+ super.toString();
    }

    @Override
    public String getInfo() {
        return String.format("\"%s,%s,%s,%s,%s\n", this.getId(), this.getName(), this.getSex(), this.getDate(),this.getVip());
    }
}
