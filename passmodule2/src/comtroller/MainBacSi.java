package comtroller;

import model.BacSi;
import service.impl.BacSiService;
import util.ReadWriteBacSi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainBacSi {
    public static void menuBacSi() {
        Scanner scanner = new Scanner(System.in);
        List<BacSi> bacSiList = new ArrayList<>();
        bacSiList.add(new BacSi(5, "dinh", "nam", 3));
        bacSiList.add(new BacSi(6, "dinh", "nam", 4));
        ReadWriteBacSi.writeBacSi("src\\data\\bacsi.csv", bacSiList);
        BacSiService bacSiService = new BacSiService();
        int option;
        do {
            System.out.println("===MENU-BÁC-SĨ===\n"
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
                    bacSiService.add();
                    break;
                case 2:
                    bacSiService.display();
                    break;
                case 3:
                    bacSiService.delete();
                    break;
            }
        } while (option <= 0 || option > 3);
    }

}
