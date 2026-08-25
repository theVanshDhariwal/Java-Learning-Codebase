package Java.Concept_Wise.CoreJava.InnerClasses.Test;

import Java.Concept_Wise.CoreJava.InnerClasses.LocalInnerClass.Hotel;

public class HotelTest {
    public static void main(String[] args) {
        Hotel hotel = new Hotel("Suryavanshi's", 100, 0);

        hotel.reserveRoom("Vansh Dhariwal", 10);
        System.out.println();
        hotel.reserveRoom("Don", 24);


    }
}