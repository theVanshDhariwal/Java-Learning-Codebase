package Java.Chapter_Wise.Chapter_03;

public class Practice_Set_3_012 {
    public static void main(String[] args) {
        String sc = new String("Vansh Dhariwal");
        System.out.println(sc);

        // 1. :-->
        sc = sc.toLowerCase();
        System.out.println(sc);

        // 2. :-->
        sc = sc.replace(' ', '_');
        System.out.println(sc);

        // 3. :-->
        String str = "Dear <|name|>, thanks a lot";
        System.out.println("The old letter is: " + str);
        str = str.replace("<|name|>", "Vansh");
        System.out.println("And the new letter is: " + str);

        // 4. :-->
        String myString = "This string contains  double and triple   spaces";
        System.out.println("Cehcking for double spaces: " + myString.indexOf("  "));
        System.out.println("Cehcking for triple spaces: " + myString.indexOf("   "));

        // 5. :-->
        String letter = "Dear Harry,\n\tThis java course is nice.\n\tThanks!";
        System.out.println(letter);
    }
}
