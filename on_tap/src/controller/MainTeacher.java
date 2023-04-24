package controller;

import model.Teacher;
import service.impl.TeacherService;
import util.ReadWriteTeacher;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainTeacher {
    public static void menuTeacher() {
        Scanner scanner = new Scanner(System.in);
        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(new Teacher(1, "Diễm", 5.555));
        ReadWriteTeacher.writeTeacher("src\\data\\teacher.csv", teacherList);
        TeacherService teacherService = new TeacherService();
        int option;

        do {
            System.out.println("===MENU-TEACHER===\n"
                    + " 1. Thêm giáo viên\n"
                    + " 2. Hiển thị danh sách giáo viên\n"
                    + " 3. Xoá giáo viên theo id\n"
                    + " 4. Tìm giáo viên theo id\n"
                    + " 5. Return");
            System.out.print("Nhập lựa chọn của bạn:");
            option = Integer.parseInt(scanner.nextLine());
            if (option <= 0 || option > 5) {
                System.out.println("Lựa chọn không phù hợp, vui lòng nhập lại!!!");
            }

            switch (option) {
                case 1:
                    teacherService.add();
                    break;
                case 2:
                    teacherService.display();
                    break;
                case 3:
                    teacherService.delete();
                    break;
                case 4:
                    teacherService.find();
                    break;
                case 5:
                    menuTeacher();
            }

        } while (option <= 0 || option > 5);
    }
}
