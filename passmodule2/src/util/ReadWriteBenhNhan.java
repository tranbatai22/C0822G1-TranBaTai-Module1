package util;

import model.BenhNhan;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadWriteBenhNhan {
    public static List<String> readFile(String path) {
        List<String> stringList = new ArrayList<>();
        try {
            File file = new File(path);
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                stringList.add(line);
            }
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return stringList;
    }

    public static List<BenhNhan> readBenhNhan(String path){
        List<String> stringList = readFile(path);
        List<BenhNhan> benhNhanList = new ArrayList<>();
        String[] arr;
        for (String line: stringList) {
            arr = line.split(",");
            if (arr.length == 5){
                benhNhanList.add(new BenhNhan(Integer.parseInt(arr[0]),arr[1], arr[2],arr[3], arr[4]));
            }
        }
        return benhNhanList;
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

    public static void writeBenhNhan(String path, List<BenhNhan> benhNhanList){
        StringBuilder stringBuilder = new StringBuilder(path);
        for (BenhNhan item: benhNhanList) {
            stringBuilder.append(item.getInfo());
        }
        writeFile(path, stringBuilder.toString());
    }
}
