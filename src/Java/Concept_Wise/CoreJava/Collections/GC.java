package Java.Concept_Wise.CoreJava.Collections;

import java.lang.ref.WeakReference;

public class GC {
    /*
    public static void main(String[] args) {
        Phone phone = new Phone("POCO", "M6 pro 5G");
        System.out.println(phone);
        phone = null;
        System.out.println(phone);

    }
    */
    public static void main(String[] args) {
        WeakReference<Phone> phone = new WeakReference<>(new Phone("POCO", "M6 pro 5G"));
        System.out.println(phone.get());
        System.gc();
//        try {
//            Thread.sleep(10000);
//        } catch (InterruptedException ignored) {
//        }
        System.out.println(phone.get());
    }
}

class Phone {
    private final String brand;
    private final String model;

    public Phone(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    @Override
    public String toString() {
        return "Brand : " + brand + ", Model: " + model;
    }
}
