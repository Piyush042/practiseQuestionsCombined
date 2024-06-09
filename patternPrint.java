import java.util.Scanner;

public class patternPrint {

    public static int[] generateSeries(int n) {
        int[] series = new int[n * (n + 1) / 2]; // Calculate the size of the series array
        int num = 6;
        int diff = 22;
        int index = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                series[index++] = num;
                num += diff;
                diff += 16;
            }
        }
        return series;
    }

    public static String[][] generatePyramid(int[] series, int n) {
        String[][] pyramid = new String[n][];
        int index = 0;
        for (int i = 0; i < n; i++) {
            pyramid[i] = new String[i + 1];
            for (int j = 0; j <= i; j++) {
                pyramid[i][j] = String.format("%05d", series[index++]);
            }
        }
        return pyramid;

    }

    public static void printPyramid(String[][] pyramid) {
        for (String[] row : pyramid) {
            for (String num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the width of the bottom-most layer of the Pyramid (N): ");
        int n = scanner.nextInt();
        scanner.close();

        int[] series = generateSeries(n);
        String[][] pyramid = generatePyramid(series, n);

        System.out.println("Pyramid:");
        printPyramid(pyramid);
    }
}
