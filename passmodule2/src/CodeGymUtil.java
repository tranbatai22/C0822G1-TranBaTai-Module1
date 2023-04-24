import com.sun.media.sound.InvalidFormatException;

import java.util.Scanner;

public class CodeGymUtil {
    public static final String CLASSNAME = "C[0-9]{2}2[0-9]{1}G[0-9]{1}";

    public static boolean isValidClassName(String className){
        if (className.matches(CLASSNAME)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào tên 1 lớp: ");
        String name = scanner.nextLine();
        if (isValidClassName(name)) {
            System.out.println("Tên lớp là: " + name);
        } else {
            throw new Exception("InvalidFormatCGNameException");
        }
    }
}

