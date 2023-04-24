package model;

//extends: kế thừa
//geter, seter , private: bao đóng
//abtract class: trừu tượng
//         :đa hình
public class BacSi extends XYZ{
    private int year;

    public BacSi(int id, String name, String sex, int year) {
        super(id, name, sex);
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "BacSi{" +
                "year=" + year +
                '}'+ super.toString();
    }

    @Override
    public String getInfo() {
        return String.format("%s,%s,%s,%s\n", this.getId(), this.getName(), this.getSex(), this.getYear());
    }
}
