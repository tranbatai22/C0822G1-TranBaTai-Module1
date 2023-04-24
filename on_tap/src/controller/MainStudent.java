package controller;

import model.Student;
import service.impl.StudentService;
import util.ReadWriteStudent;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainStudent {
    public static void menuStudent() {
        Scanner scanner = new Scanner(System.in);
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student(2, "Tài", 6.789));
        ReadWriteStudent.writeStuden(studentList);
        StudentService studentService = new StudentService();
        int option;

        do {
            System.out.println("===MENU-STUDENT===\n"
                    + " 1. Thêm học sinh\n"
                    + " 2. Hiển thị danh sách học sinh\n"
                    + " 3. Xoá học sinh theo id\n"
                    + " 4. Tìm học sinh theo id\n"
                    + " 5. Return");
            System.out.print("Nhập lựa chọn của bạn:");
            option = Integer.parseInt(scanner.nextLine());
            if (option <= 0 || option > 5) {
                System.out.println("Lựa chọn không phù hợp, vui lòng nhập lại!!!");
            }

            switch (option) {
                case 1:
                    studentService.add();
                    break;
                case 2:
                    studentService.display();
                    break;
                case 3:
                    studentService.delete();
                    break;
                case 4:
                    studentService.find();
                    break;
                case 5:
                    menuStudent();
            }

        } while (option <= 0 || option > 5);
    }
}
