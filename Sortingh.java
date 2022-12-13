import java.util.*;

// or we can use the inbuit library (import java.util.Arrays)
public class Sortingh {
    public static void selectionsortted(int array[]) {
        int minpos = 0;
        for (int i = 0; i < array.length; i++) {
            minpos = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[minpos] > array[j]) {
                    minpos = j;
                }
            }
            // swapping;
            int temp = array[minpos];
            array[minpos] = array[i];
            array[i] = temp;
        }
    }

    public static void bubblesort(int array[]) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    // swapping those values
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public static void insertionsort(int array[]) {
        for (int i = 1; i < array.length; i++) {
            int current = array[i];
            int prev = i - 1;
            while (prev >= 0 && array[prev] > current) {
                array[prev + 1] = array[prev];
                prev--;
            }
            array[prev + 1] = current;
        }
    }

    public static void countingsort(int array[]) {
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++) {
            max = Math.max(max, array[i]);
        }
        int count[] = new int[max + 1];
        for (int i = 0; i < array.length; i++) {
            count[array[i]]++;
        }

        int j = 0;

        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                array[j] = i;
                j++;
                count[i]--;
            }
        }
    }

    public static void print(int array[]) {
        System.out.print("Your sorted array is :");
        for (int i = 0; i < array.length; i++) {
            System.out.print(" " + array[i]);
        }
        System.out.println();
    }

    public static void main(String args[]) {
        int array[] = { 5, 3, 2, 4, 1 };
        insertionsort(array);
        print(array);
    }
}