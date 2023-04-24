package util;

import model.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadWriteStudent {
        public static List<String> readFile(String path){
        List<String> stringList = new ArrayList<>();
        try{
            File file = new File(path);
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine())!= null){
                stringList.add(line);
            }
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return stringList;
    }

    public static List<Student> readStudent(String path){
        List<String> stringList = readFile(path);
        List<Student> studentList = new ArrayList<>();
        String[] arr;
        for (String line: stringList) {
            arr = line.split(",");
            if (arr.length == 3){
                studentList.add(new Student(Integer.parseInt(arr[0]), arr[1],Double.parseDouble(arr[2])));
            }
        }
        return studentList;
    }

    public static void writeFile(String path, String data){
        try{
            File file = new File(path);
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(data);
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
//
    public static void writeStuden( List<Student> studentList){
            String path = "D:\\CodeGym\\on_tap\\src\\service\\impl\\StudentService.java";
        StringBuilder stringBuilder = new StringBuilder(path);
        for (Student student: studentList) {
            stringBuilder.append(student.toString());
        }
        writeFile(path, stringBuilder.toString());
    }


//    public static List<String> readStudent(String path) {
//        List<String> list = new ArrayList<>();
//        try {
//            File file = new File(path);
//            FileReader fileReader = new FileReader(file);
//            BufferedReader bufferedReader = new BufferedReader(fileReader);
//
//            String line;
//            while ((line = bufferedReader.readLine()) != null) {
//                list.add(line);
//            }
//            bufferedReader.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        return list;
//    }
//    public static void writeStuden(String path, List<Student> list) {
//
//        try {
//            File file1 = new File(path);
//            FileWriter fileWriter = new FileWriter(file1);
//            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
//
//            for (Student item : list) {
//                bufferedWriter.write(String.valueOf(item));
//                bufferedWriter.newLine();
//            }
//
//            bufferedWriter.close();
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
}
