import java.lang.reflect.Array;
import java.util.Scanner;

public class Main {
    public static int[][] MULTIPLICATION_TABLE = new int[10][10];

    public static void printTable() {
        StringBuilder result = new StringBuilder();
        for (int[] ints : MULTIPLICATION_TABLE) {
            for (int anInt : ints) {
                result.append(anInt).append(String.valueOf(anInt).length() == 2 ? " " : "  ");
            }
            result.append("\n");
        }

        System.out.println(result);
    }

    public static void main(String[] args) {
        final int limit = 10;
        for (int i = 1; i <= limit; i++) {
            int[] row = new int[limit];

            for (int j = 1; j <= limit; j++) {
                row[j - 1] = j * i;
            }

            MULTIPLICATION_TABLE[i - 1] = row;
        }

        printTable();
    }

}

