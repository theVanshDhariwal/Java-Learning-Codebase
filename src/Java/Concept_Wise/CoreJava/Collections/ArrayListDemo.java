package Java.Concept_Wise.CoreJava.Collections;

public class ArrayListDemo {
    public static void main(String[] args) throws Exception {



        /*

        //  Resetting the capacity.{
        ArrayList<Integer> integers = new ArrayList<>();
        //  Initial capacity :--> 10
        integers.add(1);
        integers.add(2);
        integers.add(3);
        integers.trimToSize();  // Now the capacity is equal to the size, and which is 3.
        }

        Sorting {
        List<Integer> integers = new ArrayList<>(List.of(3, 4, 7, 2, 7, 1, 6));
        System.out.println(integers);
        Collections.sort(integers);
        System.out.println(integers);
        integers.sort(null);
        System.out.println(integers);
        }

        Converting the list to the array {

        List<Integer> integers = List.of(1, 2, 3, 4, 5);
        Integer[] array = integers.toArray(new Integer[0]);
        for (int i : array) {
            System.out.println(i);
        }
        }

        Checking {
        List<Integer> list = List.of(1, 2, 3, 4, 5);
        System.out.println(list.contains(4));
        System.out.println(list.contains(400));
        }

        Copying elements {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);
        list.add(0, 0);
        System.out.println(list);
        List<Integer> list1 = List.of(4, 5, 6, 7, 8, 9);
        list.addAll(list1);
        System.out.println(list);
        }

        // Flexibility {

        ArrayList<String> list = new ArrayList<>(); // Full flexible
        list.add("My");
        list.add("name");
        list.add("is");
        list.add("Vansh");
        System.out.println();
        System.out.println(list);
        list.remove(0);
        System.out.println(list);
        list.set(0, "It");
        System.out.println(list);

        System.out.println();
        List<String> list1 = Arrays.asList("Hello " + "Vansh " + "Dhariwal ");// Can use the set method to replace object
        list1.remove("Hello ");
        System.out.println(list1); // Will not work.
        list1.set(0, list1.get(0).replace("Hello ", "It's "));
        System.out.println(list1);

        System.out.println();
        List<Integer> list3 = List.of(1, 2, 3, 4, 5, 6);
        System.out.println(list3);
//      list3.set(0, 10); // Not allowed.
        }

        // Removing elements {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        System.out.println(list);
        list.remove(3); //  Via index
        System.out.println(list);
        list.remove(Integer.valueOf(3));    //  Via object
        System.out.println(list);

        System.out.println();

        ArrayList<String> list1 = new ArrayList<>();

        list1.add("Hello");
        list1.add("Vansh");
        list1.add("Dhariwal");

        System.out.println(list1);
        list1.remove(2);    // Via index
        System.out.println(list1);
        list1.remove("Hello");  // Via object
        System.out.println(list1);
        }

        //  size & capacity {

        System.out.println("ArrayList Size: " + list.size());
        Field field = ArrayList.class.getDeclaredField("elementData");  // Reflection
        field.setAccessible(true);
        Object[] elementData = (Object[]) field.get(list);
        System.out.println("ArrayList Capacity: " + elementData.length);
        }

        //  Declaring methods {

        List<String> list1 = Arrays.asList("Hello" , "Vansh" , "Dhariwal");
        ArrayList<Integer> list = new ArrayList<>(100); // setting the initial capacity.
        List<String> list1 = new ArrayList<>();
        }

        //  Adding methods {
        list.set(0, 0);

        list.add(1);    //  add in back
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        }

        // Ways to print an array list {

        Integer i = list.get(3);

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
        for (int i : list) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println(list);
        }
         */

    }
}
