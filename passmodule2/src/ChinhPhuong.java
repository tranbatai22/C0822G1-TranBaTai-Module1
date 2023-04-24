public class ChinhPhuong {
    public static boolean check(int number){
        for (int i = 1; i < number ; i++) {
            if (i * i == number){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        for (int i = 0; i < 100 ; i++) {
            if (check(i)){
                System.out.println(i);
            }
        }
    }

}
