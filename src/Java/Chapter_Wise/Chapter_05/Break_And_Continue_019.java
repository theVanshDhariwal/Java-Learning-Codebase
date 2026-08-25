package Java.Chapter_Wise.Chapter_05;

public class Break_And_Continue_019 {
    public static void main(String[] args) {
        // Break statement :-->

        for (int i = 1; i <= 10; i++) {
            if (i == 3) {
                break;
            }
            System.out.println(i);
        }

        //Continue statement :-->

        for (int i = 1; i <= 10; i++) {
            if (i == 3 || i == 6 || i == 9) {
                continue;
            }
            System.out.println(i);
        }
    }
}