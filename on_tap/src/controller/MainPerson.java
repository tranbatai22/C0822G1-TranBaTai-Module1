package controller;

import java.util.Scanner;

public class MainPerson {
    public static void menuPerson() {
        Scanner scanner = new Scanner(System.in);
        int option;
        do {
            System.out.println("===MENU-PERSON===\n"
                    + " 1. Student\n"
                    + " 2. Teacher\n"
                    + " 3. Return");
            System.out.print("Nhập lựa chọn của bạn:");
            option = Integer.parseInt(scanner.nextLine());
            if (option <= 0 || option > 3) {
                System.out.println("Lựa chọn không phù hợp, vui lòng nhập lại!!!");
            }
            switch (option) {
                case 1:
                    MainStudent.menuStudent();
                    break;
                case 2:
                    MainTeacher.menuTeacher();
                    break;
                case 3:
                    menuPerson();
            }
        } while (option <= 0 || option > 3);
    }
}
