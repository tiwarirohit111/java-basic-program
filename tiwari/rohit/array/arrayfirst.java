package array;

public class arrayfirst {
    public static void main (String [] args) 
    {
        int[] arr;
        arr = new int[3];
        arr [0] = 10;
        arr [1] = 29;
        arr [2] = 23;
        for (int i = 0; i < arr.length; i++)
            System.out.println("Element at index " + i + ":" + arr [i]);
    }

    }
