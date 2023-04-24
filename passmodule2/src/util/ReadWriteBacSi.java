package util;

import model.BacSi;
import model.BenhNhan;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadWriteBacSi {
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

    public static List<BacSi> readBacSi(String path){
        List<String> stringList = readFile(path);
        List<BacSi> bacSiList = new ArrayList<>();
        String[] arr;
        for (String line: stringList) {
            arr = line.split(",");
            if (arr.length == 4){
                bacSiList.add(new BacSi(Integer.parseInt(arr[0]),arr[1], arr[2],Integer.parseInt(arr[3])));
            }
        }
        return bacSiList;
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

    public static void writeBacSi(String path, List<BacSi> bacSiList){
        StringBuilder stringBuilder = new StringBuilder(path);
        for (BacSi item: bacSiList) {
            stringBuilder.append(item.getInfo());
        }
        writeFile(path, stringBuilder.toString());
    }
}
