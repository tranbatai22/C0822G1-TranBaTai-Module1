package comtroller;

import model.BacSi;
import model.BenhNhan;
import service.impl.BacSiService;
import service.impl.BenhNhanService;
import util.ReadWriteBacSi;
import util.ReadWriteBenhNhan;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainBenhNhan {
    public static void menuBenhNhan() {
        Scanner scanner = new Scanner(System.in);
        List<BenhNhan> benhNhans = new ArrayList<>();
        benhNhans.add(new BenhNhan(5, "dinh", "nam", "22/2", "6789"));
        benhNhans.add(new BenhNhan(6, "dinh", "nam", "03/5", "9876"));
        ReadWriteBenhNhan.writeBenhNhan("src\\data\\benhnhanh.csv", benhNhans);
        BenhNhanService benhNhanService = new BenhNhanService();
        int option;
        do {
            System.out.println("===MENU-BỆNH-NHÂN===\n"
                    + " 1. Thêm mới\n"
                    + " 2. Hiển thị\n"
                    + " 3. Xoá");
            System.out.print("Nhập lựa chọn: ");
            option = Integer.parseInt(scanner.nextLine());
            if (option <= 0 || option > 3) {
                System.out.println("Lựa chọn không phù hợp, vui lòng nhập lại!!!");
            }
            switch (option) {
                case 1:
                    benhNhanService.add();
                    break;
                case 2:
                    benhNhanService.display();
                    break;
                case 3:
                    benhNhanService.delete();
                    break;
            }
        } while (option <= 0 || option > 3);
    }

}
