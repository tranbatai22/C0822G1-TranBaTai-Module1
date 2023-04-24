package comtroller;

import java.util.Scanner;

public class MainController {
    public static void menuXYZ() {
        Scanner scanner = new Scanner(System.in);
        int option;
        do {
            System.out.println("===MENU-BÊNH-VIỆN===\n"
                    + " 1. Bác Sĩ\n"
                    + " 2. Bệnh Nhân");
            System.out.print("Nhập lựa chọn: ");
            option = Integer.parseInt(scanner.nextLine());
            if (option <= 0 || option > 2) {
                System.out.println("Lựa chọn không phù hợp, vui lòng nhập lại!!!");
            }
            switch (option) {
                case 1:
                    MainBacSi.menuBacSi();
                    break;
                case 2:
                    MainBenhNhan.menuBenhNhan();
                    break;
            }
        } while (option <= 0 || option > 2);
    }

}
