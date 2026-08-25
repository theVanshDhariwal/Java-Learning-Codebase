package Java.Concept_Wise.CoreJava.Generics.GenericEnums;

enum Operation {
    ADD, SUBTRACT, MULTIPLY, DIVIDE;

    public <T extends Number> double apply(T a, T b) {
        switch (this) {
            case ADD:
                return a.doubleValue() + b.doubleValue();
            case SUBTRACT:
                return a.doubleValue() - b.doubleValue();
            case MULTIPLY:
                return a.doubleValue() * b.doubleValue();
            case DIVIDE:
                return a.doubleValue() / b.doubleValue();
            default:
                throw new AssertionError("Unknown Operation: " + this);
        }
    }
}

public class Calculator {
    public static void main(String[] args) {
        double apply = Operation.ADD.apply(10, 20);
        System.out.println(apply);
        System.out.println(Operation.SUBTRACT.apply(50, 15));
    }
}

//public class Calculator {
//    public static void main(String[] args) {
//        Integer intArray[] = {1, 2, 3, 4, 5};
//        String strArray[] = {"Hello", "Vansh", "Dhariwal"};
//        printArray(intArray);
//        printArray(strArray);
//    }

//    public static <T> void printArray(T[] array) {
//        for (T i : array) {
//            System.out.print(i + " ");
//        }
//        System.out.println();
//    }
//}
