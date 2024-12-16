import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        System.out.println("Задание 1");
        // первый массив
        int[] firstArray = new int[3];
        firstArray[0] = 1;
        firstArray[1] = 2;
        firstArray[2] = 3;
        // второй массив
        double[] secondArray = {1.57, 7.654, 9.986};
        // третий массив
        int[] thirthArray = new int[3];

        System.out.println(" Задание 2");
        System.out.println(Arrays.toString(firstArray));
        System.out.println(Arrays.toString(secondArray));
        System.out.println(Arrays.toString(thirthArray));

        System.out.println("Задание 3");

        int[] firstArray1 = {1, 2, 3};
        for (int i = firstArray1.length - 1; i >= 0; i--) {
            if (i != 0) {
                System.out.print(firstArray1[i] + ",");
            } else {
                System.out.print(firstArray1[i]);
            }
        }
        System.out.println();
        double[] secondArray2 = {1.57, 7.654, 9.986};
        for (int i = secondArray2.length - 1; i >= 0; i--) {
            if (i != 0) {
                System.out.print(secondArray2[i] + ", ");
            } else {
                System.out.print(secondArray2[i]);
            }
        }
        System.out.println();
        int[] thirthArray3 = new int[3];
        for (int i = thirthArray3.length - 1; i >= 0; i--) {
            if (i != 0) {
                System.out.print(thirthArray3[i] + ", ");
            } else {
                System.out.print(thirthArray3[i]);
            }
        }
        System.out.println();
        System.out.println(" Задание 4");
        for (int a = 0; a < firstArray.length; a++) {
            if (firstArray[a] % 2 != 0) {
                firstArray[a] = firstArray[a] + 1;
            }
            System.out.println(Arrays.toString(firstArray));
        }
    }


}
