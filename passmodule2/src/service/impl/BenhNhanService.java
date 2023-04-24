package service.impl;

import model.BenhNhan;
import service.IBenhNhanService;
import util.ReadWriteBenhNhan;

import java.util.List;
import java.util.Scanner;

public class BenhNhanService implements IBenhNhanService {
    public static final Scanner SCANNER = new Scanner(System.in);
    public static final String PATH = "src\\data\\benhnhanh.csv";

    @Override
    public void add() {
        List<BenhNhan> benhNhans = ReadWriteBenhNhan.readBenhNhan(PATH);
        System.out.print("Nhập id: ");
        int id = Integer.parseInt(SCANNER.nextLine());
        System.out.print("Nhập tên: ");
        String name = SCANNER.nextLine();
        System.out.print("Nhập giới tính: ");
        String sex = SCANNER.nextLine();
        System.out.print("Nhập ngày sinh: ");
        String data = SCANNER.nextLine();
        System.out.print("Nhập mã VIP: ");
        String vip = SCANNER.nextLine();
        benhNhans.add(new BenhNhan(id, name,sex, data, vip));
        ReadWriteBenhNhan.writeBenhNhan(PATH, benhNhans);
        System.out.println("Thêm mới thành công!!!");
    }

    @Override
    public void display() {
        List<BenhNhan> benhNhans = ReadWriteBenhNhan.readBenhNhan(PATH);
        for (BenhNhan item: benhNhans) {
            System.out.println(item);
        }
    }

    @Override
    public void delete() {

    }
}
