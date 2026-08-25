package Java.Chapter_Wise.Chapter_06;

public class Ps_022 {
    public static void main(String[] args) {
        // 1. :-->

        // float[] var = { 5f, 4f, 6f, 7f, 8f };
        // float setCalculator = 0;
        // for (int i = 0; i < var.length; i++) {
        // setCalculator += var[i];
        // }
        // System.out.println("The setCalculator is: " + setCalculator);

        // 2. :-->

        // Scanner scan = new Scanner(System.in);
        // int[] arr = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 };
        // System.out.print("Enter an integer to check that, it is present into the array
        // or not: ");
        // int n = scan.nextInt();
        // boolean isPresent = false;
        // for (int element : arr) {
        // if (n == element) {
        // isPresent = true;
        // }
        // }
        // if (isPresent) {
        // System.out.println(n + " is present in the array.");
        // } else {
        // System.out.println("The " + n + " is not present in the array.");
        // }

        // 3. :-->

        // Scanner scan = new Scanner(System.in);
        // System.out.print("Enter the number of students: ");
        // int n = scan.nextInt();
        // int[] marks = new int[n];
        // System.out.println("Enter the physics marks of " + n + " students:->");
        // for (int i = 0; i < marks.length; i++) {
        // marks[i] = scan.nextInt();
        // }
        // float setCalculator = 0f, avg = 0f;
        // for (int element : marks) {
        // setCalculator += element;
        // }
        // avg = setCalculator / n;
        // System.out.print("The average of marks of " + n + " students is: " + avg);

        // 4. :-->

        int[][] mat1 = new int[2][3];
        mat1[0][0] = 12;
        mat1[0][1] = 34;
        mat1[0][2] = 56;
        mat1[1][0] = 89;
        mat1[1][1] = 76;
        mat1[1][2] = 23;

        int[][] mat2 = {{23, 45, 56},
                {43, 56, 34}};

        int[][] mat3 = {{0, 0, 0},
                {0, 0, 0}};

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                mat3[i][j] = mat1[i][j] + mat2[i][j];
            }
        }
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(mat3[i][j] + " ");
            }
            System.out.println();
        }

        // 5. :-->

        // Scanner scan = new Scanner(System.in);
        // System.out.print("Enter the size of an 1-D array: ");
        // int a = 0, n = scan.nextInt();
        // System.out.print("Enter the " + n + " elements of array: ");
        // int[] arr = new int[n];
        // for (int i = 0; i < n; i++) {
        // arr[i] = scan.nextInt();
        // }
        // for (int i = 0; i < n / 2; i++) {
        // a = arr[i];
        // arr[i] = arr[n - i - 1];
        // arr[n - i - 1] = a;
        // }
        // for (int element : arr) {
        // System.out.print(element + " ");
        // }

        // 6. :-->

        // int[] array = { 12, 23, 65, 344, 567, 556, 575, 976 };
        // int max = Integer.MIN_VALUE;
        // for (int i = 0; i < array.length; i++) {
        // if (array[i] > max) {
        // max = array[i];
        // }
        // }
        // System.out.println(max);

        // 7. :-->

        // int[] array = { 12, 23, 65, 344, 567, 556, 575, 976 };
        // int min = Integer.MAX_VALUE;
        // for (int i = 0; i < array.length; i++) {
        // if (array[i] < min) {
        // min = array[i];
        // }
        // }
        // System.out.println(min);

        // 8, :-->

        // int[] array = { 12, 23, 65, 344, 567, 568, 575, 976 };
        // boolean isSorted = true;
        // for (int i = 0; i < array.length - 1; i++) {
        // if (array[i] > array[i + 1]) {
        // isSorted = false;
        // break;
        // }
        // }
        // if (isSorted) {
        // System.out.println("The Array is sorted");
        // } else {
        // System.out.println("The Array is not sorted");
        // }

        // scan.close();
    }
}
