package service.impl;

import model.Person;
import model.Student;
import model.Teacher;
import service.IPersonService;
import util.ReadWriteStudent;
import util.ReadWriteTeacher;

import java.util.List;
import java.util.Scanner;

public class TeacherService implements IPersonService {
    public static final Scanner SCANNER = new Scanner(System.in);
    public static final String PATH = "src\\data\\teacher.csv";
    @Override
    public void add() {
        List<Teacher> teacherList = ReadWriteTeacher.readTeacher(PATH);
        System.out.print("Nhập id: ");
        int id = Integer.parseInt(SCANNER.nextLine());
        System.out.print("Nhập tên: ");
        String name = SCANNER.nextLine();
        System.out.print("Nhập lương: ");
        double salary = Double.parseDouble(SCANNER.nextLine());
        teacherList.add(new Teacher(id, name, salary));
        ReadWriteTeacher.writeTeacher(PATH, teacherList);
        System.out.println("Thêm mới thành công!!!");
    }

    @Override
    public void display() {
        List<Teacher> teacherList = ReadWriteTeacher.readTeacher(PATH);
        for (Teacher teacher: teacherList) {
            System.out.println(teacher);
        }
    }

    @Override
    public void delete() {
        List<Teacher> teacherList = ReadWriteTeacher.readTeacher(PATH);
        boolean check = false;
        do {
            System.out.print("Nhập id muốn xoá: ");
            int id = Integer.parseInt(SCANNER.nextLine());
            int index = 0;
            for (int i = 0; i < teacherList.size(); i++) {
                if (teacherList.get(i).getId() == id) {
                    check = true;
                    index = i;
                }
            }
            if (!check) {
                System.out.println("id không tồn tại, vui lòng nhập lại!!!");
            } else {
                teacherList.remove(index);
                ReadWriteTeacher.writeTeacher(PATH, teacherList);
            }
        }while (!check);

    }

    @Override
    public void find() {

    }
}
