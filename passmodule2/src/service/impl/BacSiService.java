package service.impl;

import model.BacSi;
import model.BenhNhan;
import service.IBacSiService;
import util.ReadWriteBacSi;
import util.ReadWriteBenhNhan;

import java.util.List;
import java.util.Scanner;

public class BacSiService implements IBacSiService {
    public static final Scanner SCANNER = new Scanner(System.in);
    public static final String PATH = "src\\data\\bacsi.csv";
    @Override
    public void add() {
        List<BacSi> bacSiList = ReadWriteBacSi.readBacSi(PATH);
        System.out.print("Nhập id: ");
        int id = Integer.parseInt(SCANNER.nextLine());
        System.out.print("Nhập tên: ");
        String name = SCANNER.nextLine();
        System.out.print("Nhập giới tính: ");
        String sex = SCANNER.nextLine();
        System.out.print("Nhập ngày sinh: ");
        int year = Integer.parseInt(SCANNER.nextLine());
        bacSiList.add(new BacSi(id, name,sex, year));
        ReadWriteBacSi.writeBacSi(PATH, bacSiList);
        System.out.println("Thêm mới thành công!!!");
    }

    @Override
    public void display() {
        List<BacSi> bacSiList = ReadWriteBacSi.readBacSi(PATH);
        for (BacSi item: bacSiList) {
            System.out.println(item);
        }
    }

    @Override
    public void delete() {

    }
}
