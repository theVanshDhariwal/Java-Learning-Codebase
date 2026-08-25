package Java.Chapter_Wise.Chapter_03;

public class Printing_Methods_010 {
    public static void main(String[] args) {
        String name = "Hello Vansh Dhariwal how are you today!";
        System.out.println(name);
        String Name = "Hello Suryavanshi how are you today!";
        System.out.println(Name);

        // Printing like C and C++ format in a java program :-->

        int A = 5;
        float F = 34.56464f;
        System.out.printf("The value of A is: %d\nOR\\n", A);
        System.out.printf("The value of A is: %5d\n", A);
        System.out.format("THE value of F is: %sound\nOR\n", F);
        System.out.format("THE value of F is: %.2f", F);
    }
}
