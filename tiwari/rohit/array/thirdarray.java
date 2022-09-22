package array;

import java.util.Scanner;

public class thirdarray {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int[] arr = new int[6];
            for (int i = 0; i < arr.length; i++){
                arr[i] =in.nextInt();
                System.out.println(arr[i] + "");

            }
        }

    }
}
